package hotel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Scanner;

import static java.time.Period.between;

/**
 * Created by diveldhu on 20-4-2017.
 */
public class BoekingsRegister {
    private static ArrayList<Gast> gastenRegister = new ArrayList<>();
    private static ArrayList<Boeking> boekingsRegister = new ArrayList<>();
    private static ArrayList<Kamer> hotelKamers = new ArrayList<>();
    private static int AANTALKAMERS = 8;

    // constructor. Deze maakt alle kamers aan en legt hun eigenschappen vast.
    public BoekingsRegister() {
        for (int i = 0; i<AANTALKAMERS; i++) {
            hotelKamers.add(new HotelKamer(i+1, i<4));
        }

        gastenRegister.add(new HotelGast("Kim Lammers", "Singel 14", "Amsterdam", "Nederland",  "06-12345678", "hockey"));
        gastenRegister.add(new HotelGast("Ruud van Nistelrooij", "Have 3" , "Eindhoven", "Nederland",  "06-45678912", "voetbal"));
        gastenRegister.add(new HotelGast("Yuri van Gelder", "Strand 145a", "Oranjestad", "Curaçao", "0900-45678", "ringen"));
    }

    public void maakBoeking(Gast g){
        LocalDateTime startDatumBoeking = null, eindDatumBoeking=null;
        Scanner input = new Scanner(System.in);

        System.out.println("Voor welke periode wilt u een kamer boeken?");
        System.out.println("Geef de startdatum op (dd-mm-yyyy)");
        try {
            startDatumBoeking = LocalDateTime.parse(input.nextLine(),DateTimeFormatter.ofPattern("dd-MM-yyyy"));}
        catch (RuntimeException e) {
            System.out.println("Geen geldige keuze");
        }
        System.out.printf("Start boeking op datum "+ startDatumBoeking.toString());
        System.out.println("Geef de einddatum op (dd-mm-yyyy)");
        try {eindDatumBoeking = LocalDateTime.parse(input.nextLine(),DateTimeFormatter.ofPattern("dd-MM-yyyy"));}
        catch (RuntimeException e) {
            System.out.println("Geen geldige keuze");
        }
        System.out.printf("Start boeking op datum "+ startDatumBoeking.toString()+ " en eindig boeking op " + eindDatumBoeking.toString());
        System.out.println("Beschikbare kamers zijn:");
        toonBeschikbareKamers();
        System.out.println("Voor welke kamer wilt u reserveren?");
        Kamer kamer = getKamerOBVNummer(Integer.parseInt(input.next()));
        //Period periode = Period.between(startDatumBoeking.toLocalDate(), eindDatumBoeking.toLocalDate());
        if(isKamerBeschikbaarInPeriode(kamer, startDatumBoeking, eindDatumBoeking)) {
            HotelBoeking h = new HotelBoeking(kamer, startDatumBoeking, eindDatumBoeking);
            boekingsRegister.add(h);
            System.out.println("Kamer " + kamer.getKamernummer() + " is geboekt voor periode " + startDatumBoeking.toString() + " - " + eindDatumBoeking.toString());
        }
    }

    public void maakBoeking(){
        Scanner input = new Scanner(System.in);
        Gast g;

        System.out.println("Voor welke gast wilt u een boeking maken?");
        System.out.println("Vul de achternaam van de gast in");
        String inputTekst = input.next();

        g = getGast(inputTekst);
        if (g!= null) {
            maakBoeking(g);
        } else {
            maakBoeking(maakNieuweHotelGast());
        }

    }
    public void aanpassenBoeking(){

    }

    public void beheer(){

    }

    public void aanpassenKamer(){

    }

    public void toonGasten(){
        for (Gast g : gastenRegister) {
            System.out.print(g.getNaam() + " " + g.getAdres() + " "+ g.getWoonplaats() + " " + g.getLand() + " " + g.getTelefoonNummer() + " " g.getBijzonderheden());
        }
    }

    public Gast maakNieuweHotelGast() {
        Scanner input = new Scanner(System.in);
        String naam, adres, postcode, woonplaats, land, telefoonnummer;
        System.out.println("Geef naam in");
        naam = input.nextLine();
        System.out.println("Geef adres in");
        adres = input.nextLine();
        System.out.println("Geef postcode in");
        postcode = input.nextLine();
        System.out.println("Geef woonplaats in");
        woonplaats = input.nextLine();
        System.out.println("Geef land in");
        land = input.nextLine();
        System.out.println("Geef telefoonnummer in");
        telefoonnummer = input.nextLine();
        return new HotelGast(naam, adres, postcode, woonplaats, land, telefoonnummer);
    }

    public void opvoerenNieuweGast(){

    }
    public void aanpassenGast(){

    }

    public void toonBeschikbareKamers(LocalDateTime start, LocalDateTime eind) {
    }

    public void toonBeschikbareKamers(LocalDateTime start, LocalDateTime eind, boolean isluxeKamer) {

    }

    public Kamer getKamerOBVNummer(int kamernummer) {
        return hotelKamers.get(kamernummer);
    }

    public boolean isKamerBeschikbaarInPeriode(Kamer k, LocalDateTime start, LocalDateTime eind) {

        for (Boeking b : boekingsRegister) {
            if (b.getGeboekteKamer() != k) {
                break;
            }else {
                return overlap(start, eind, b.getStartDatum(), b.getEindDatum());
            }
        }
        return true;
    }

    private boolean overlap(LocalDateTime s1, LocalDateTime e1, LocalDateTime s2, LocalDateTime e2) {
        //boolean answer = false;
        //if (s1.isAfter(e2)) return false;
        //if (e1.isBefore(s2)) return false;
        if (s1.isAfter(s2) && s1.isBefore(e2)) return true;
        if (e1.isAfter(s2) && e1.isBefore(e2)) return true;
        if (s1.isBefore(s2) && e1.isAfter(e2)) return true;
        return false;
    }

    private Gast getGast(String naam) {
        for (Gast g : gastenRegister){
            if (g.getNaam().equals(naam)) {
                return g;
            }
        }
        return null;
    }
}
