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

    public void setId(int id) {
        this.id = id;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public void setTema(String tema) {
        this.tema = tema;
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