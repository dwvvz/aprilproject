package hotel;

import java.time.Duration;

/**
 * Created by diveldhu on 21-4-2017.
 */
public class Stats {
    private Duration gemiddeldeDuur;
    int beeindigdeTochten;
    Duration totaleDuur;
    Stats(int beeindigdeTochten, Duration totaleDuur) {
        this.beeindigdeTochten = beeindigdeTochten;
        this.totaleDuur = totaleDuur;
        gemiddeldeDuur = beeindigdeTochten > 0 ? totaleDuur.dividedBy(beeindigdeTochten) : Duration.ZERO;
        //System.out.println("min : "+ totaleDuur.toMinutes() + " millis "+ totaleDuur.toMillis());
    }

    public Duration getGemiddeldeDuur() {
        return gemiddeldeDuur;
    }
}
