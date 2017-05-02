package hotel;

/**
 * Created by diveldhu on 20-4-2017.
 */
import java.time.Duration;
import java.time.LocalTime;

import static java.time.LocalTime.now;

/**
 * Created by lmanna on 19-4-2017.
 */
public abstract class Tocht {

    protected LocalTime startTijd;
    protected LocalTime eindTijd;

    Tocht() {
        startTijd = now();
    }
    public boolean einde() {
        if (isBeeindigd()) {
            //System.out.println("Deze tocht was al beëindigd. Tocht is niet gestopt");
            return false;
        }else {
            eindTijd = now();
            return true;
        }
    }

    public LocalTime getStartTijd() {
        return startTijd;
    }

    public LocalTime getEindTijd() {
        return eindTijd;
    }

    public Duration getDuur() {
        if (eindTijd != null) {
            Duration d = Duration.between(startTijd, eindTijd);
            if (d.isNegative()) return Duration.ZERO;
            else return d;
        }
        else {
            return Duration.ZERO;
        }
    }

    public boolean isBeeindigd() {
        return eindTijd != null;
    }

    public String tochtLocatie() { return "op het water";}

}