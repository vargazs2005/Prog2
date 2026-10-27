package Labor7;

public class VendegLatoIE {
    private String nev;
    private int ferohelyekSzama;
    private boolean dohanyzo;

    public VendegLatoIE(String nev, int ferohelyekSzama, boolean dohanyzo) {
        this.nev = nev;
        this.ferohelyekSzama = ferohelyekSzama;
        this.dohanyzo = dohanyzo;
    }

    public String getNev() {
        return nev;
    }

    public int getFerohelyekSzama() {
        return ferohelyekSzama;
    }

    public boolean isDohanyzo() {
        return dohanyzo;
    }

    public void setDohanyzo(boolean dohanyzo) {
        this.dohanyzo = dohanyzo;
    }

    @Override
    public String toString() {
        return "VendegLatoIE{" +
                "nev='" + nev + '\'' +
                ", ferohelyekSzama=" + ferohelyekSzama +
                ", dohanyzo=" + dohanyzo +
                '}';
    }
}
