package Labor7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {
    public static List<Kocsma> adottItaltKinaloKocsmak(String ital, VendegLatoIE t[]) {
        List<Kocsma> kocs = new ArrayList<>();
        for (VendegLatoIE i : t) {
            if (i instanceof Kocsma) {      // Fontos az instanceof -- osztály vizsgálat, hogy az-e az osztálya!!!
                //Innentől az "i" már Kocsma osztályú, mert csak az lehet.

                //Régebbi verziókban manuálisan kellett, így:
                Kocsma k = (Kocsma) i;
                for (String sör : k.getSorlap()) {
                    if (sör.equals(ital)) {
                        kocs.add(k);    // kocs listához kocsma hozzáadása.
                    }
                }
            }
        }
        return kocs;
    }

    static void main(String[] args) {
        VendegLatoIE [] t = new VendegLatoIE[5];
        int [] szamok = new int[]{3,7,9};

        t[0] = new Kocsma("Törik-Szakad", 123, new String[]{"Borsodi","Soproni"});
        // Helyettesítés elve: A szülő egy példányát helyettesítheti a gyerek osztálya is. VendegLatoIE osztályú tömbbe Kocsma osztályú példány került. És működhet, mert a VendegLatoIE gyermeke.
        t[1] = new Etterem("Campus", 56, new String[]{"Babgulyás", "Mákos tészta"});
        t[2] = new Kocsma("Törik-Szakad2", 153, new String[]{"Kőbányai","Soproni"});
        t[3] = new Kocsma("Törik-Szakad3", 113, new String[]{"Csíki Sör", "Borsodi","Soproni"});
        t[4] = new Kocsma("Törik-Szakad4", 103, new String[]{"Borsodi","Soproni"});

        List<Kocsma> result = adottItaltKinaloKocsmak("Borsodi", t);

        Collections.sort(result);   // Növekvő sorrend

        for (Kocsma i : result) {
            System.out.println(i);
        }
    }
}
