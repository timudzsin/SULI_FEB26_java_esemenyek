public class Auto {
    private String marka;
    private String rendszam;
    private int gyartasiEv;
    private int ar;
    private String tulaj;

    public Auto(String sor) {
        String[] darabok = sor.split(";");
        this.marka = darabok[0];
        this.rendszam = darabok[1];
        this.gyartasiEv = Integer.parseInt(darabok[2]);
        this.ar = Integer.parseInt(darabok[3]);
        this.tulaj = darabok[4];
    }

    public String getRendszam() {
        return rendszam;
    }

    public String getMarka() {
        return marka;
    }

    public int getGyartasiEv() {
        return gyartasiEv;
    }

    public int getAr() {
        return ar;
    }

    public String getTulaj() {
        return tulaj;
    }
}
