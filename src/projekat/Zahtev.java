package projekat;

public class Zahtev {

    //sadrzaj, velicina dokumenta, naziv dokumenta
    String sadrzajZahteva;
    int velicinaZahteva;
    String nazivZahteva;

    public Zahtev(String sadrzajZahteva, int velicinaZahteva, String nazivZahteva) {
        this.sadrzajZahteva = sadrzajZahteva;
        this.velicinaZahteva = velicinaZahteva;
        this.nazivZahteva = nazivZahteva;
    }

    public String getSadrzajZahteva() {
        return sadrzajZahteva;
    }

    public int getVelicinaZahteva() {
        return velicinaZahteva;
    }

    public String getNazivZahteva() {
        return nazivZahteva;
    }

    @Override
    public String toString() {
        return this.nazivZahteva;
    }

}
