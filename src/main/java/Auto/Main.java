package Auto;

/**
 * Created by diveldhu on 20-4-2017.
 */
public class Main {
    public static void main(String[] args) {
        Opel myOpel = new Meriva();
        Enzo myEnzo = new Enzo();
        myOpel.drive();
        myOpel.eco();
        myEnzo.drive();
        myEnzo.turbo();
        System.out.println("eind");
    }
}
