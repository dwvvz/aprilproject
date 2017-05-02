package hotel;

import java.time.LocalDateTime;
import java.time.Period;

/**
 * Created by diveldhu on 20-4-2017.
 */
public class HotelBoeking implements Boeking{
    private Kamer geboekteKamer;
    private LocalDateTime startdatum;
    private LocalDateTime einddatum;
    private Period boekingsPeriode;

    HotelBoeking(Kamer k, LocalDateTime s, LocalDateTime e){
        this.geboekteKamer = k;
        this.startdatum = s;
        this.einddatum = e;
        this.boekingsPeriode = Period.between(s.toLocalDate(), e.toLocalDate());
    }

    HotelBoeking(Kamer k, LocalDateTime start, Period p) {
        this.geboekteKamer = k;
        this.startdatum = start;
        this.einddatum = start.plus(p);
    }

    @Override
    public Boeking getBoeking(Boeking b) {
        return b;
    }

    @Override
    public void setBoeking(Kamer k, Period p) {

    }

    public void setBoeking(Kamer k, LocalDateTime s, LocalDateTime e) {

    }

    @Override
    public Kamer getGeboekteKamer() {
        return geboekteKamer;
    }

    @Override
    public void setGeboekteKamer(Kamer k) {
        geboekteKamer = k;
    }

    @Override
    public LocalDateTime getStartDatum() {
        return null;
    }

    @Override
    public void setStartDatum(LocalDateTime l) {

    }

    @Override
    public LocalDateTime getEindDatum() {
        return null;
    }

    @Override
    public void setEindDatum(LocalDateTime l) {

    }
}
