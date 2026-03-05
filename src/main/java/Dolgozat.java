// kész

import java.time.LocalDate;

public class Dolgozat extends Esemeny {
    private String tantargy;

    public Dolgozat(String statusz, int id, String cim, LocalDate datum, String tantargy) {
        super(statusz, id, cim, datum);
        this.tantargy = tantargy;
    }

    public String getTantargy() {
        return tantargy;
    }

    public void setTantargy(String tantargy) {
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