package hotel;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by diveldhu on 20-4-2017.
 */
public class MainHotel {
    public static void main(String[] args) {
        System.out.println("Welkom bij het boekingssysteem van Hotel OCA\n");
        BoekingsRegister register = new BoekingsRegister();

        while(true) {
            Scanner input = new Scanner(System.in);
            System.out.printf("Typ één van de volgende keuzes: \n\n'1' voor het boeken van een kamer\n'2' voor het aanpassen of verwijderen van een boeking\n'3' voor het beheren van de verschillende boekingen\n'4' voor het aanpassen van een kamer\n'5' voor het opvoeren van een nieuwe gast\n'6' voor het aanpassen van een gast\n");

            String keuze = input.next().trim();

            while (keuze=="") {
                System.out.printf("Dit is geen geldige invoer.\n" + keuze);
                keuze = input.next();
            }
            switch (keuze) {
                case "1":
                    register.maakBoeking();
                    break;
                case "2":
                    register.aanpassenBoeking();
                    break;
                case "3":
                    register.beheer();
                    break;
                case "4":
                    register.aanpassenKamer();
                    break;
                case "5":
                    register.opvoerenNieuweGast();
                    break;
                case "6":
                    register.aanpassenGast();
                    break;
                default:
                    System.out.printf("Ongeldige keuze. Kies een getal van 1 t/m 6\n");
            }
        }
    }
}
