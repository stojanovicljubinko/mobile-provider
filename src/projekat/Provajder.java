package projekat;

import java.io.Serializable;

public class Provajder implements Serializable {

    private static final long serialVersionUID = 1L;
    private String imePrezime, prebivaliste, proizvodjac, model, brojTelefona;
    private double cena;
    private int id;

    public Provajder() {
        imePrezime = null;
        prebivaliste = null;
        proizvodjac = null;
        model = null;
        brojTelefona = null;
        cena = 0;
        id = 0;
    }

    public Provajder(String imePrezime, String prebivaliste, String proizvodjac, String model, String brojTelefona, double cena, int id) {
        this.imePrezime = imePrezime;
        this.prebivaliste = prebivaliste;
        this.proizvodjac = proizvodjac;
        this.model = model;
        this.brojTelefona = brojTelefona;
        this.cena = cena;
        this.id = id;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public String getPrebivaliste() {
        return prebivaliste;
    }

    public String getProizvodjac() {
        return proizvodjac;
    }

    public String getModel() {
        return model;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public double getCena() {
        return cena;
    }

    public int getId() {
        return id;
    }

}
