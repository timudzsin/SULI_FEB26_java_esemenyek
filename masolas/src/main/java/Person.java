public class Person {
    private boolean nem;      // true = férfi, false = nő
    private int kor;
    private String nev;
    private String borszin;
    private double magassag;      // méterben
    private String foglalkozas;

    // Konstruktor
    public Person(boolean nem, int kor, String nev, String borszin, double magassag, String foglalkozas) {
        this.nem = nem;
        this.kor = kor;
        this.nev = nev;
        this.borszin = borszin;
        this.magassag = magassag;
        this.foglalkozas = foglalkozas;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nem=" + nem +
                ", kor=" + kor +
                ", nev='" + nev + '\'' +
                ", borszin='" + borszin + '\'' +
                ", magassag=" + magassag +
                ", foglalkozas='" + foglalkozas + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}