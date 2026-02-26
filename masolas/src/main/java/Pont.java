public class Pont {
    private int x, y;
    private String nev;

    public Pont(int y, int x, String nev) {
        this.y = y;
        this.x = x;
        this.nev = nev;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    @Override
    public String toString() {
        return "Pont{" +
                "x=" + x +
                ", y=" + y +
                ", nev='" + nev + '\'' +
                '}';
    }

    @Override
    public Pont clone(){
        try {
            return (Pont)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("nem clonable!");
        }
    }
}
