package hotel;

/**
 * Created by diveldhu on 20-4-2017.
 */
public class HotelKamer implements Kamer {
        private int kamernummer;
        private boolean luxeKamer;

    public HotelKamer(int kamernummer, boolean luxeKamer) {
        this.setKamernummer(kamernummer);
        this.setLuxeKamer(luxeKamer);
    }

    @Override
    public int getKamernummer() {
        return kamernummer;
    }

    @Override
    public void setKamernummer(int i) {
        kamernummer = i;
    }

    @Override
    public boolean isLuxeKamer() {
        return luxeKamer;
    }

    @Override
    public void setLuxeKamer(boolean b) {
        luxeKamer = b;
    }
}
