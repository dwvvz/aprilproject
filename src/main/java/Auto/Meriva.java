package Auto;

/**
 * Created by diveldhu on 20-4-2017.
 */
public class Meriva extends Opel {

    @Override
    public void drive() {
        System.out.println("Deze " + this.getClass().toString() + " rijdt");    }

    @Override
    public void reverse() {

    }

    @Override
    public void stop() {

    }

    @Override
    void eco() {
        this.kilometrage = 20.6;
        System.out.println("Kilometrage = " + kilometrage);
        System.out.println("Opel kilometrage = "+ super.kilometrage);
    }
}
