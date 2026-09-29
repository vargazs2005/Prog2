package Labor4;

public class Császár {
    private String nev;
    private int szul_ev;

    public Császár(String nev, int szul_ev) {
        this.nev = nev;
        this.szul_ev = szul_ev;
    }

    public String getNev() {
        return nev;
    }

    public int getSzul_ev() {
        return szul_ev;
    }

    //public void setSzul_ev(int szul_ev) {
    //    this.szul_ev = szul_ev;
    //}

    @Override
    public String toString() {
        return this.nev + "(" + this.szul_ev + ")";
    }
}
