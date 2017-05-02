package hotel;

import java.time.LocalDateTime;
import java.time.Period;
/**
 * Created by diveldhu on 20-4-2017.
 */
public interface Boeking {
    public Boeking getBoeking(Boeking b);
    public void setBoeking(Kamer k, Period p);
    public Kamer getGeboekteKamer();
    public void setGeboekteKamer(Kamer k);
    public LocalDateTime getStartDatum();
    public void setStartDatum(LocalDateTime l);
    public LocalDateTime getEindDatum();
    public void setEindDatum(LocalDateTime l);
}
