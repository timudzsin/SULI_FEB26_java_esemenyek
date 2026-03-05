// kész

import java.time.LocalDate;

public class SzinhaziRendezveny extends Esemeny {
    private String rendezo;

    public SzinhaziRendezveny(String statusz, int id, String cim, LocalDate datum, String rendezo) {
        super(statusz, id, cim, datum);
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