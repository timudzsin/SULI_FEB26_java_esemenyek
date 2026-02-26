import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public final class Dokumentum {
    private final int id;
    private final String cim;
    private final LocalDate datum;
    private final String tipus;
    private final String felekSzamaVagyUgyszam;

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("yyyyMMMdd").withLocale(java.util.Locale.ENGLISH);

    public Dokumentum(String line) {
        String[] parts = line.split(";");

        this.id = Integer.parseInt(parts[0]);
        this.cim = parts[1];
        this.datum = LocalDate.parse(parts[2], FORMATTER);
        this.tipus = parts[3];
        this.felekSzamaVagyUgyszam = parts[4];
    }

    public int getId() {
        return id;
    }

    public String getCim() {
        return cim;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public String getTipus() {
        return tipus;
    }

    public String getFelekSzamaVagyUgyszam() {
        return felekSzamaVagyUgyszam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dokumentum)) return false;
        Dokumentum that = (Dokumentum) o;
        return id == that.id &&
                cim.equals(that.cim) &&
                datum.equals(that.datum) &&
                tipus.equals(that.tipus) &&
                felekSzamaVagyUgyszam.equals(that.felekSzamaVagyUgyszam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cim, datum, tipus, felekSzamaVagyUgyszam);
    }
}
