package hotel;

import java.time.Duration;
import java.util.Scanner;

import static java.time.LocalTime.now;

/**
 * Created by diveldhu on 21-4-2017.
 */
public class UserInterface {
    private Kaartenbak kaartenbak = new Kaartenbak();

    public void userInterface() {
        System.out.println("#################################################");
        System.out.println("###   Welkom in hotel WaterWorld CamelCaSe   ####");
        System.out.println("#################################################");
        //System.out.println();

        while(true) {

            System.out.printf("\nWilt u een boot uitgeven of innemen? \n'u' voor uitgeven  \n'i' voor innemen  \n's' voor statistieken:\n");

            Scanner input = new Scanner(System.in);
            String inputString = input.next().trim();

            if (inputString !="") {
                switch (inputString) {
                    case ("u") : {
                        System.out.println("Wilt u een tocht op het meer of op de rivier starten?");
                        System.out.println("Typ een 'm' voor meer of een r voor rivier");
                        inputString = input.next().trim();
                        switch (inputString) {
                            case ("m") : {
                                System.out.println(kaartenbak.startTocht(false));
                                break;
                            }
                            case ("r") : {
                                kaartenbak.startTocht(true);
                                break;
                            }
                            default:
                                System.out.println("Ongeldige keuze");
                        }
                        break;
                    }
                    case ("i") : {
                        System.out.println("Welk nummer wilt u innemen?");
                        if (input.hasNextInt()) {
                            int tochtnummer = Integer.parseInt(input.next());
                            System.out.println(kaartenbak.eindeTocht(tochtnummer));
                        }
                        else {
                            System.out.println("Ongeldige invoer.");
                        }
                        break;
                    }
                    case ("s") : {
                        Stats s = new Stats(kaartenbak.getBeeindigdeTochten(), kaartenbak.getTotaleDuurTochten());
                        System.out.println("Er zijn vandaag " + kaartenbak.getBeeindigdeTochten() + " tochten voltooid met een gemiddelde duur van " + DurationFormatter.format(s.getGemiddeldeDuur()));
                        kaartenbak.tochtenOverzicht();
                        break;
                    }
                    default:
                        System.out.printf("Dit is geen geldige invoer.\n");
                }
                //inputString = input.next();
            }
        }
    }
}

    /*public static void eindigTocht(int tochtnummer) {
        if (tochtnummer > tochtReg.size() || tochtnummer<1) {
            System.out.println("Dit nr bestaat niet");
        } else {
            System.out.println("Ingenomen nummer is: " + tochtnummer);
            Tocht t = tochtReg.get(tochtnummer - 1);
            if (t.isTochtBeeindigd()) {
                System.out.println("Tocht is al beëindigd. Kies een ander nummer");
            } else {
                t.getStartTijd();
                t.setEindTijd(now());
                t.setTochtBeeindigd(true);
                Duration duur = Duration.between(t.getStartTijd(), t.getEindTijd());
                long seconds = duur.getSeconds();
                System.out.println((seconds / 60 / 60) + ":" + (seconds / 60 % 60) + ":" + (seconds % 60));
            }
        }
    }
    public static void startTocht(){
        Tocht t = new Tocht();
        t.setStartTijd(now());
        int tochtnummer = tochtReg.size()+1;
        t.setTochtNummer(tochtnummer);
        tochtReg.add(t);
        System.out.println("Het nieuwe tochtnummer is " + tochtnummer);
    }
    public static void getStatistics(){
        int aantalTochten;
        int terug=0;
        long gemTochtDuur=0L;

        aantalTochten = tochtReg.size();
        if (aantalTochten==0) {
            System.out.println("\n\tEr zijn nog geen tochten teruggekeerd!");
        }else {

            for (int i = 0; i < tochtReg.size(); i++) {
                Tocht t = tochtReg.get(i);
                if (t.isTochtBeeindigd()) {
                    terug++;
                    Duration duur = Duration.between(t.getStartTijd(), t.getEindTijd());
                    gemTochtDuur += duur.getSeconds();
                }
            }
            gemTochtDuur=gemTochtDuur/terug;
        }


        System.out.println("\n\tEr zijn vandaag " + aantalTochten + " boten uitgevaren.");
        System.out.println("\tEr zijn intussen " + terug + " boten terug.");
        System.out.println("\tDe gemiddelde duur van een tocht was " + (gemTochtDuur / 60 / 60) + ":" + (gemTochtDuur / 60 % 60) + ":" + (gemTochtDuur % 60 + "\n"));
    }*/
