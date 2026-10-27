package Labor7;

import java.util.Arrays;

public class Etterem extends VendegLatoIE {
    private String [] etlap;

    public Etterem(String nev, int ferohelyekSzama, String[] etlap) {
        super(nev, ferohelyekSzama, false);
        this.etlap = etlap;
    }

    public String[] getEtlap() {
        return etlap;
    }

    @Override
    public String toString() {
        return "Etterem{" +
                "etlap=" + Arrays.toString(etlap) +
                '}';
    }
}
