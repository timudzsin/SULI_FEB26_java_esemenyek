import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Program {

    private List<Esemeny> esemenyek = new ArrayList<>();

    public void beolvasFajlbol(String fajlNev) {
        try (BufferedReader br = new BufferedReader(new FileReader(fajlNev))) {
            String sor;
            while ((sor = br.readLine()) != null) {
                String[] adatok = sor.split(";");

                String tipus = adatok[0];
                int id = Integer.parseInt(adatok[1]);
                String tema = adatok[2];
                LocalDate datum = LocalDate.parse(adatok[3]);

                if (tipus.equals("SZINHAZ")) {
                    esemenyek.add(new SzinhaziRendezveny(id, tema, datum, adatok[4]));
                } else if (tipus.equals("DOLGOZAT")) {
                    esemenyek.add(new Dolgozat(id, tema, datum, adatok[4]));
                } else if (tipus.equals("KONCERT")) {
                    esemenyek.add(new Koncert(id, tema, datum, adatok[4]));
                }
            }
        } catch (IOException e) {
            System.out.println("Hiba a fájl olvasásakor!");
        }
    }

    public void listaz() {
        for (Esemeny e : esemenyek) {
            System.out.println(e);
        }
    }

    public List<Esemeny> getEsemenyek() {
        return esemenyek;
    }
}