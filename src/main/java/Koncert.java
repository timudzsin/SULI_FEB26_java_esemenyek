// kész

import java.time.LocalDate;

public class Koncert extends Esemeny {
    private String eloado;

    public Koncert(String statusz, int id, String cim, LocalDate datum, String eloado) {
        super(statusz, id, cim, datum);
        this.eloado = eloado;
    }

    public String getEloado() {
        return eloado;
    }

    public void setEloado(String eloado) {
        this.eloado = eloado;
    }

    @Override
    public String getTipus() {
        return "Koncert";
    }

    @Override
    public String toString() {
        return super.toString() + ", Előadó: " + eloado;
    }
}