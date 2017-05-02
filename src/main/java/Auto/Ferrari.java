package Auto;

/**
 * Created by diveldhu on 20-4-2017.
 */
public abstract class Ferrari implements Auto{
    boolean turboIsOn = false;

    void turbo() {
        System.out.println("Turbo is aan!");
        setTurboOn();
    }

    abstract void setTurboOn();
}
