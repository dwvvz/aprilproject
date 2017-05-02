package Auto;

/**
 * Created by diveldhu on 20-4-2017.
 */
public class Enzo extends Ferrari {

    @Override
    public void drive() {
        System.out.println("Deze "+ this.getClass().toString() + " rijdt fantastisch "+ (this.turboIsOn?"met":"zonder") + " turbo!");
    }

    @Override
    public void reverse() {
        System.out.println("reverse");
    }

    @Override
    public void stop() {

    }

    @Override
    void setTurboOn() {
        this.turboIsOn = true;
    }
}
