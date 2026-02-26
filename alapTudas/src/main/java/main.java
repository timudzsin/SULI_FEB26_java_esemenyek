import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class main {
    private List<Auto> autok;

    public static void main(String[] args) throws IOException {
        List<String> sorok = Files.readAllLines(Path.of("adatok.txt"));

        new main().feladatok(sorok);
    }

    public void feladatok(List<String> sorok) {
        autok = new ArrayList<>();
        for (int i = 1; i < sorok.size(); i++) {
            Auto auto = new Auto(sorok.get(i));
            autok.add(auto);
        }
        
        f1_autoDb();
        f2_bmwDb();
        f3_bmwMaxArTulaj();
        f4_van2000UtaniVN();
        f5_mindenAutoAra3MFeletti();
        f6_autoTipusokSzama();
        //f7_melyikTipusbolMennyi();
    }

    private void f6_autoTipusokSzama() {
        System.out.println("\n-----6. feladat-----");
        ArrayList<String> tipusok = new ArrayList<>();
        for (int i = 0; i < autok.size(); i++) {
            if(tipusok.contains(autok.get(i).getMarka())) {

            } else {
                tipusok.add(autok.get(i).getMarka());
            }
        }
        System.out.println("Autó típusok száma: " + tipusok.size());
    }

    private void f5_mindenAutoAra3MFeletti() {
        System.out.println("\n-----5. feladat-----");
        boolean mindenAutoAra3MFeletti = true;
        int i = 0;
        while (mindenAutoAra3MFeletti == true && i < autok.size()) {
            if(autok.get(i).getAr() <= 3) {
                mindenAutoAra3MFeletti = false;
            }
            i++;
        }
        System.out.println("Minden autó ára 3M felett van-e: " + mindenAutoAra3MFeletti);
    }

    private void f4_van2000UtaniVN() {
        System.out.println("\n-----4. feladat-----");
        boolean van2000Utani = false;
        int i = 0;
        while(van2000Utani == false && i < autok.size()) {
            if (autok.get(i).getGyartasiEv() > 2000) {
                van2000Utani = true;
            }
            i++;
        }
        System.out.println("Van-e 2000 utáni: " + van2000Utani);
    }

    private void f3_bmwMaxArTulaj() {
        System.out.println("\n-----3. feladat-----");
        int bmwMaxArIndex = 0;
        for (int i = 0; i < autok.size(); i++){
            if(autok.get(bmwMaxArIndex).getAr() < autok.get(i).getAr()) {
                bmwMaxArIndex = i;
            }
        }
        System.out.println("A legdrágább BMW tulaja: " + autok.get(bmwMaxArIndex).getTulaj());
    }

    private void f2_bmwDb() {
        System.out.println("\n-----2. feladat-----");
        int db = 0;
        for (int i = 0; i < autok.size(); i++){
            if(Objects.equals(autok.get(i).getMarka(), "BMW")) {
                db++;
            }
        }
        System.out.println("BMW-k száma: " + db);
    }

    private void f1_autoDb() {
        System.out.println("\n-----1. feladat-----");
        System.out.println("Autók száma: " + autok.size());
    }
}
