import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainProgram {
    public static void main(String[] args) throws Exception {
        MainProgram program = new MainProgram();
        program.futtat();
    }

    public void futtat() throws Exception {
        Set<Dokumentum> dokumentumok = new HashSet<>();

        // fájl beolvasása soronként listába
        Path path = Paths.get("src/main/resources/adat.txt");
        List<String> sorok = Files.readAllLines(path);

        // első sor (fejléc) kihagyása, majd for ciklussal feldolgozás
        for (int i = 1; i < sorok.size(); i++) {
            dokumentumok.add(new Dokumentum(sorok.get(i)));
        }

        System.out.println("Beolvasott dokumentumok száma: " + dokumentumok.size());

        System.out.println("\nListázás:");
        listazas(dokumentumok);

        System.out.println("\nKeresés 2-re:");
        kereses(dokumentumok, 200);
    }

    public void listazas(Set<Dokumentum> dokumentumok) {
        for (Dokumentum d : dokumentumok) {
            System.out.println(d.getId() + ";" + d.getCim() + ";" + d.getDatum() + ";" + d.getTipus() + ";" + d.getFelekSzamaVagyUgyszam());
        }
    }

    public void kereses(Set<Dokumentum> dokumentumok, int id) {
        for (Dokumentum d : dokumentumok) {
            if (d.getId() == id) {
                System.out.println(d.getId() + ";" + d.getCim() + ";" + d.getDatum() + ";" + d.getTipus() + ";" + d.getFelekSzamaVagyUgyszam());
                return; // megtaláltuk, kilépünk
            }
        }
        System.out.println("Nincs ilyen azonosítójú dokumentum: " + id);
    }
}