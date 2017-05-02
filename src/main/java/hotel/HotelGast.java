package hotel;

import java.security.SecureRandom;

/**
 * Created by diveldhu on 20-4-2017.
 */
public class HotelGast implements Gast {
    private String naam;
    private String adres;
    private String woonplaats;
    private String land;
    private String email;
    private String telefoonnummer;
    private String bijzonderheden;

    public HotelGast(String naam, String adres, String woonplaats, String land, String telefoonnummer, String bijzonderheden) {
        this.naam = naam;
        this.adres = adres;
        this.woonplaats = woonplaats;
        this.land = land;
        this.telefoonnummer = telefoonnummer;
        this.bijzonderheden = bijzonderheden;
    }

    @Override
    public String getNaam() {
        return naam;
    }

    @Override
    public void setNaam(String s) {
        naam = s;
    }

    @Override
    public String getAdres() {
        return adres;
    }

    @Override
    public void setAdres(String s) {
        adres = s;
    }

    @Override
    public String getWoonplaats() {
        return woonplaats;
    }

    @Override
    public void setWoonplaats(String s) {
        woonplaats = s;
    }

    @Override
    public String getLand() {
        return land;
    }

    @Override
    public void setLand(String s) {
        land = s;
    }

    @Override
    public String getTelefoonNummer() {
        return telefoonnummer;
    }

    @Override
    public void setTelefoonNummer(String s) {
        telefoonnummer = s;
    }

    @Override
    public String getBijzonderheden() {
        return bijzonderheden;
    }

    @Override
    public void setBijzonderheden(String s) {
        bijzonderheden = s;
    }
}
