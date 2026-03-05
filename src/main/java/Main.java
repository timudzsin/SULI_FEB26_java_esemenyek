// kész

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Program program = new Program();
        program.beolvasFajlbol("adatok.txt");

//        program.listaz();
//        program.listazTipus("Dolgozat");

        // ha meghírdetett nem lehet változtatni a címét, ha lezárt nem lehet változtatni a dátumát sem
//        Esemeny egyEsemeny = program.getEsemenyek().get(4);
//        System.out.println(egyEsemeny);
//        egyEsemeny.setCim("Kegyetlen dolgozat");
//        egyEsemeny.setDatum(LocalDate.parse("2027-11-01"));
//        System.out.println(egyEsemeny);

        // résztvevők
        Esemeny egyEsemeny = program.getEsemenyek().get(0);
        
        System.out.println(egyEsemeny);
        System.out.println(egyEsemeny.getResztvevok());

        Ember balint = new Ember("Bálint");
        Ember kristof = new Ember("Kristóf");
        egyEsemeny.addResztvevo(balint);
        egyEsemeny.addResztvevo(kristof);
        egyEsemeny.addResztvevo(kristof);
        System.out.println(egyEsemeny.getResztvevok());
    }
}