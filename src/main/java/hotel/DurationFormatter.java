package hotel;

import java.time.Duration;

/**
 * Created by gerard on 21-4-17.
 */
public class DurationFormatter {
    public static String format(Duration duration) {
        return String.format("%02d:%02d:%02d",
                duration.getSeconds() / 60 / 60 % 60,
                duration.getSeconds() / 60 % 60,
                duration.getSeconds() % 60);
    }
}
