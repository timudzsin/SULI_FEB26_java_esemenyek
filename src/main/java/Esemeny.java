// kész

import java.time.LocalDate;

public abstract class Esemeny {
    private String statusz;
    private int id;
    private String cim;
    private LocalDate datum;

    public Esemeny(String statusz, int id, String cim, LocalDate datum) {
        this.statusz = statusz;
        this.id = id;
        this.cim = cim;
        this.datum = datum;
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

    public void setCim(String cim) {
        if(this.statusz.equals("MEHIRDETETT") || this.statusz.equals("LEZÁRT")) {
            System.out.println("ennek az eseménynek nem lehet váoltoztatni a címét.");
            return;
        }
        this.cim = cim;
    }

    public void setDatum(LocalDate datum) {
        if(this.statusz.equals("LEZÁRT")) {
            System.out.println("ennek az eseménynek nem lehet váoltoztatni a dátumát.");
            return;
        }
        this.datum = datum;
    }

    // Polimorf kiírás
    public abstract String getTipus();

    @Override
    public String toString() {
        return "ID: " + id +
                ", Státusz: " + statusz +
                ", Cím: " + cim +
                ", Dátum: " + datum +
                ", Típus: " + getTipus();
    }
}