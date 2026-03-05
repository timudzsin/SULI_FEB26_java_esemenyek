// kész

import java.time.LocalDate;

public class SzinhaziRendezveny extends Esemeny {
    private String rendezo;

    public SzinhaziRendezveny(int id, String tema, LocalDate datum, String rendezo) {
        super(id, tema, datum);
        this.rendezo = rendezo;
    }

    public String getRendezo() {
        return rendezo;
    }

    public void setRendezo(String rendezo) {
        this.rendezo = rendezo;
    }

    @Override
    public String getTipus() {
        return "Színházi rendezvény";
    }

    @Override
    public String toString() {
        return super.toString() + ", Rendező: " + rendezo;
    }
}