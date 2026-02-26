import java.time.LocalDate;

public class Koncert extends Esemeny {
    private String eloado;

    public Koncert(int id, String tema, LocalDate datum, String eloado) {
        super(id, tema, datum);
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