package hotel;

import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * Created by diveldhu on 21-4-2017.
 */
public class Kaartenbak {
    private ArrayList<Tocht> kaartenbak;
    Kaartenbak () {
        kaartenbak = new ArrayList<Tocht>();
    }

    public String startTocht(boolean isRivierTocht){
        Tocht t;
        if(isRivierTocht) {
            t = new rivierTocht();
        } else {
            t = new meerTocht();
        }
        kaartenbak.add(t);
        return "Tocht "+ (kaartenbak.size()-1) + " is gestart om " + t.getStartTijd().toString();
    }

    public String eindeTocht(int tochtnummer){
        boolean tochtEindeResultaat = (tochtnummer>= 0 && tochtnummer < kaartenbak.size()) ? tochtEindeResultaat = kaartenbak.get(tochtnummer).einde() : false;
        if (tochtEindeResultaat) {
            String tochtLocatie = kaartenbak.get(tochtnummer).tochtLocatie();
            return "Tocht "+ tochtnummer + " " + tochtLocatie + " had een duur van " + DurationFormatter.format(kaartenbak.get(tochtnummer).getDuur());
        } else return "Tocht " + tochtnummer + " is niet beëindigd, omdat deze nog niet gestart is, of reeds beëindigd was.";
    }

    public int getBeeindigdeTochten() {
        int aantalBeëindigdeTochten=0;
        for (Tocht t : kaartenbak) {
            if (t.isBeeindigd()) aantalBeëindigdeTochten++;
        }
        return aantalBeëindigdeTochten;
    }

    public Duration getTotaleDuurTochten(){
        Duration totaleDuur = Duration.ZERO;
        for (Tocht t : kaartenbak) {
            if(t.isBeeindigd()) {
                totaleDuur = totaleDuur.plus(t.getDuur());
            }
        }
        //System.out.println("totale duur " + DurationFormatter.format(totaleDuur));
        return totaleDuur;
    }

    public void tochtenOverzicht() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("h:mm:ss");
        for (Tocht t : kaartenbak) {
            String eindeBericht = t.isBeeindigd() ? "\tbeëindigd om "+ dtf.format(t.getEindTijd()) : "\tnog niet beëindigd";
            System.out.println("Tocht " + kaartenbak.indexOf(t) + " " + t.tochtLocatie() + ",\tgestart om " + dtf.format(t.getStartTijd()) + ", " + eindeBericht + ",\tduur " + DurationFormatter.format(t.getDuur()));
        }
    }
}
