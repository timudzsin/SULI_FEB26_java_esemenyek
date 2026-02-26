import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class GenerikusMap {
    private HashMap<String, Integer> kulcsaErtek;

    public static void main(String[] args) {
        System.out.println(new GenerikusMap().egyediMegjelenites());
    }

    public GenerikusMap() {
        kulcsaErtek = new HashMap<>();
        kulcsaErtek.put("SQL", 5);
        kulcsaErtek.put("Prog", 4);
        kulcsaErtek.put("Matek", 3);
    }

    public String egyediMegjelenites(){
        String temp = "";
        for (Map.Entry<String, Integer> elem : kulcsaErtek.entrySet()) {
            String kulcs = elem.getKey();
            int ertek = elem.getValue();

            //System.out.printf("[%s] = %d\n", kulcs, ertek);
            temp += "[" + kulcs + "] = " + ertek + "\n";
        }
        return temp;
    }

    private void hasznalat(){
        kulcsaErtek.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println();
            }
        });
    }
}
