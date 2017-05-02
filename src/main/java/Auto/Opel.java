package Auto;

/**
 * Created by diveldhu on 20-4-2017.
 */
public abstract class Opel implements Auto{

    private final boolean IsDuits;
    public double kilometrage = 14.5;

    abstract void eco();

    //Constructor
    public Opel(){
        this.IsDuits = true;
        System.out.println("Constructor 1 uit Opel");
    }
    // Constructor 2, voor Amerikaanse Vauxhall
    public Opel(boolean IsVauxhall){
        this.IsDuits = IsVauxhall;
        System.out.println("Constructor 2 uit Opel");
    }

}
