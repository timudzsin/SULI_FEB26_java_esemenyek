import java.time.LocalDate;

public class Dolgozat extends Esemeny {
    private String tantargy;

    public Dolgozat(int id, String tema, LocalDate datum, String tantargy) {
        super(id, tema, datum);
        this.tantargy = tantargy;
    }

    @Override
    public String getTipus() {
        return "Dolgozat";
    }

    @Override
    public String toString() {
        return super.toString() + ", Tantárgy: " + tantargy;
    }
}