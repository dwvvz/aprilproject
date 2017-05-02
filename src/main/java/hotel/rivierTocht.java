package hotel;

import java.time.Duration;

/**
 * Created by diveldhu on 21-4-2017.
 */
public class rivierTocht extends Tocht {
    @Override
    public Duration getDuur() {
        Duration d;
        if (eindTijd !=null) {
            d = Duration.between(startTijd, eindTijd);
        } else {
            d = Duration.ZERO;
        }
        if (d.isNegative()) return Duration.ZERO;
        else {
            d = d.minusMinutes(30L);
            if (d.isNegative()) return Duration.ZERO;
            else return d;
        }
    }
    public String tochtLocatie(){return "over de rivier";}
}
