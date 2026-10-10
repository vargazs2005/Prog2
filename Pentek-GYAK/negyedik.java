import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class negyedik {
    static void main(String[] args) {
        System.out.println(PyUtils.range(4, 10, 1));
        System.out.println(PyUtils.range(3, 7));
        System.out.println(PyUtils.range(10));

        List<Integer> szamok = new ArrayList<>();
        szamok.add(7);
        szamok.add(5);
        szamok.add(9);
        szamok.add(6);

        System.out.println(szamok);

        List<Integer> masolat = new ArrayList<>(szamok);
        masolat.add(7);
        System.out.println("Listák:");
        System.out.println(szamok);
        System.out.println(masolat);

        Collections.sort(szamok);
        System.out.println(szamok);
        Collections.reverse(szamok);
        System.out.println(szamok);
        Collections.rotate(szamok, 1);
        System.out.println(szamok);

        // 8db primitív típus, és mindegyikhez létezik egy-egy wrapper osztály.
        // byte - Byte
        // short - Short
        // int - Integer
        // long Long
        // float - Float
        // double - Double
        // boolean - Boolean
        // char - Character


        //Egy wrapper class (csomagoló osztály) tartalmazza az adott primitív típust.
        //A java objektum orientált, így sok helyen osztályt kell megadni, a primitív típust nem fogadja el. Ezért találták ki ezt a work around megoldást. Ilyenkor a primitív típus be van csomagolva egy osztályba, így a probléma meg van oldva.

        // A listánál ezért van Integer és nem int.
        // List<Integer> masolat = new ArrayList<>(szamok);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.SIZE);

        // Deprecated azt jelenti , hogy most még használható, de hamarosan, valamelyik java verzióban törlésre kerül. Ha a fordító jelzi, akkor érdemes kicserélni.

        Integer szam = new Integer(5); //Stack - heep memória mutatás, tárolás.. Nagy esélyel több memóriát foglal
        int x = 5; //Olcsóbb, garantáltan 4 byte memóriát foglal
        System.out.println(szam);

        //Típuskonverziók:
        //Explicit:
        // double d = 2.0;
        // int n = d; --hibás lenne, inthez double rendelés nem megy. Ezért konverzálni kell:
        // int n = (int) d; --Az egész részét veszi, 2.4-ből lenne 2.
        // float f = (float)d;
        // A nagyobb tartománnyal rendelkező típusnak értékül adható a kisebb tartománnyal rendelkező típus: double d = 3.14f floatot lehet rendelni double-höz. Fordítva nem igaz.

        // Primitív típus stringgé konvertálás:
        // a)
        int i = 2;
        String s = "" + i; // i-ből string lesz.

        // b)
        String.valueOf('a'); // --> "a"
        String.valueOf(42); // --> "42"
        String.valueOf(3.14); // --> "3.14"

        // c)
        Integer.toString(2); // --> "2"

        Double.toString(3.14); // --> "3.14"



        //String --> primitív típusú érték. Pl.: "2" --> 2, "3.14" --> 3.14, "a" --> 'a'
        Integer.parseInt(s); // --> int primitív típust ad vissza
        Integer.valueOf(s); // --> Integer típusú objektumot ad vissza

        int a = szamok.get(0);
        System.out.println(x);

    }
}
