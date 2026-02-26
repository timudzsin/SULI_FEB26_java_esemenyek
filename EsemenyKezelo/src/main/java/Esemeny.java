import java.time.LocalDate;

public abstract class Esemeny {
    private int id;
    private String tema;
    private LocalDate datum;

    public Esemeny(int id, String tema, LocalDate datum) {
        this.id = id;
        this.tema = tema;
        this.datum = datum;
    }

    public int getId() {
        return id;
    }

    public String getTema() {
        return tema;
    }

    public LocalDate getDatum() {
        return datum;
    }

    // Polimorf kiírás
    public abstract String getTipus();

    @Override
    public String toString() {
        return "ID: " + id +
                ", Téma: " + tema +
                ", Dátum: " + datum +
                ", Típus: " + getTipus();
    }
}