package Labor7;

import java.util.Arrays;

public class Kocsma extends VendegLatoIE implements Comparable<Kocsma> { // extends és utána a szülő osztály. A kocsma osztály a VendegLatoIE kiterjesztése lesz.
    // Az interface-t implementáljuk (bármennyit lehet): implements
    // előbb extends aztán implements!!!
    //
    private String []sorlap;

    public Kocsma(String nev, int ferohelyekSzama, String[] sorlap) {
        super(nev, ferohelyekSzama, true); // Gyerekosztály "super"-ként hivatkozik a szülőre. A gyerek osztály mindig meghívja a szülőosztály konstruktorát.
        this.sorlap = sorlap;
    }
    //Abszrakt metódus: nincs törzse. Létezik szignatúrája, de a { } üres.

    public String[] getSorlap() {
        return sorlap;
    }

    @Override
    public String toString() {
        return super.getNev() + " " + super.getFerohelyekSzama() + " " + Arrays.toString(sorlap);
    }

    @Override       // Felül piros lámpakörte, és enter...
    public int compareTo(Kocsma o) {
        if (this.getSorlap().length == o.getSorlap().length) {
            if (this.getFerohelyekSzama() == o.getFerohelyekSzama()) {
                return this.getNev().compareTo(o.getNev());     //Két név összehasonlítása.
            } else if (this.getFerohelyekSzama() < o.getFerohelyekSzama()) {
                return -1; // Mindegy hogy mennyi az összeg, csak a szám előjele számít a compareTo miatt.
            } else {
                return 1; // Mindegy hogy mennyi az összeg, csak a szám előjele számít a compareTo miatt.
            }
        } else if (this.getSorlap().length < o.getSorlap().length) {
            return -5*(-1);  // Mindegy hogy mennyi az összeg, csak a szám előjele számít a compareTo miatt.
        } else {
            return 10*(-1); // Mindegy hogy mennyi az összeg, csak a szám előjele számít a compareTo miatt.

            // Ha csökkenőbe szeretnénk rendezni akkor előjelet kell váltani a return-okban!
        }
    }
}
