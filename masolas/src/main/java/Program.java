import javax.swing.*;

public class Program {
    public static void main(String[] args) {
        Pont egyik = new Pont(10, 14, "alpha");
        try {
            Pont masik = (Pont)egyik.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        masik.setNev("beta");
        masik.setX(2);
        masik.setY(3);
        System.out.println(egyik == masik);
        System.out.println(egyik);


//        try {
//            Person egyik = new Person(true, 23, "Sajtos Timudzsin", "fehér", 1.82, "diák");
//            Person masik = (Person) egyik.clone();
//
//            System.out.println(egyik == masik);
//            System.out.println(egyik.equals(masik));
//
//            masik.setKor(27);
//
//            System.out.println(egyik);
//            System.out.println(masik);
//        } catch (CloneNotSupportedException e) {
//            throw new RuntimeException(e);
//        }


//        SwingUtilities.invokeLater(() -> {
//            Gui egyGui = new Gui();
//            egyGui.setVisible(true);
//        });
    }
}
