// kész

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ProgramTest {
    private Program program;

    @BeforeEach
    void setUp() throws IOException {
        program = new Program();

        // Teszt fájl létrehozása
        FileWriter writer = new FileWriter("test_adatok.txt");
        writer.write("SZINHAZ;TERVEZETT;1;Hamlet;2025-05-10;Nagy Péter\n");
        writer.write("DOLGOZAT;MEHIRDETETT;2;ZH;2025-04-20;Matematika\n");
        writer.write("KONCERT;LEZÁRT;3;Tavaszi koncert;2025-06-01;Halott Pénz\n");
        writer.close();

        program.beolvasFajlbol("test_adatok.txt");
    }

    @Test
    void esemenyekSzamaMegfelelo() {
        assertEquals(3, program.getEsemenyek().size());
    }

    @Test
    void elsoElemSzinhaz() {
        assertTrue(program.getEsemenyek().get(0) instanceof SzinhaziRendezveny);
    }

    @Test
    void masodikElemDolgozat() {
        assertTrue(program.getEsemenyek().get(1) instanceof Dolgozat);
    }

    @Test
    void harmadikElemKoncert() {
        assertTrue(program.getEsemenyek().get(2) instanceof Koncert);
    }

    @Test
    void meghirdetettEsemenyCimeNemValtoztathato() {
        Esemeny a = program.getEsemenyek().get(2);
        Esemeny b = program.getEsemenyek().get(2);
        b.setCim("Tengerpari koncert");

        assertEquals(a, b);
    }

    @Test
    void lezartEsemenyDatumaNemValtoztathato() {
        Esemeny a = program.getEsemenyek().get(2);
        Esemeny b = program.getEsemenyek().get(2);
        b.setDatum(LocalDate.parse("2027-11-01"));

        assertEquals(a, b);
    }

    @Test
    void egyEsemenyreTobbszorNemMehetEgyEmber() {
        Ember kata = new Ember("Kata");

        Esemeny a = program.getEsemenyek().get(2);
        a.addResztvevo(kata);

        Esemeny b = program.getEsemenyek().get(2);
        b.addResztvevo(kata);
        b.addResztvevo(kata);

        assertEquals(a, b);
    }
}