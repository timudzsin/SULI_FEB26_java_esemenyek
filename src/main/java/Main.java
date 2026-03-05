// kész

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Program program = new Program();
        program.beolvasFajlbol("adatok.txt");

        //program.listaz();
        //program.listazTipus("Dolgozat");

        Esemeny egyEsemeny = program.getEsemenyek().get(4);
        System.out.println(egyEsemeny);
        egyEsemeny.setCim("Gigantikus dolgozat");
        egyEsemeny.setDatum(LocalDate.parse("2027-11-01"));
        System.out.println(egyEsemeny);
    }
}