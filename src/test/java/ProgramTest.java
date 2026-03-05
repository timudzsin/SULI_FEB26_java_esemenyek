// kész

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ProgramTest {
    private Program program;

    @BeforeEach
    void setUp() throws IOException {
        program = new Program();

        // Teszt fájl létrehozása
        FileWriter writer = new FileWriter("test_adatok.txt");
        writer.write("SZINHAZ;1;Hamlet;2025-05-10;Nagy Péter\n");
        writer.write("DOLGOZAT;2;ZH;2025-04-20;Matematika\n");
        writer.write("KONCERT;3;Tavaszi koncert;2025-06-01;Halott Pénz\n");
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
}