import java.util.Arrays;

public class tomb {
    static void main(String[] args) {
        //int[] scores = new int[5];  //inicializálva 0-ákkal. Azaz nem memóriaszemét lesz benne
        int[] scores = {5, 1, 7, 3, 8};

        for (int i=0;i<scores.length; i++) {    // Ide nem kell () a lenght után, mert ez nem metódus.
            System.out.println(scores[i]);
        }

        // Paraméter átadás: Amikor egy tömbböt átadunk egy metódusnak, akkor a tömb referencia szerint lesz átadva:

        int[] scoress = {5, 1, 7, 3, 8};

        modosit(scoress);

        for (int i=0;i<scoress.length; i++) {    // Ide nem kell () a lenght után, mert ez nem metódus.
            System.out.println(scoress[i]);
        }

        int[] tomb = {5, 1, 7};
        System.out.println(Arrays.toString(tomb)); // Nem az elemeket írja ki, hanem a referencia címet.

        int[] five = getOneToFive(); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(five));

        // Arrays.equals(tomb1, tomb2) -- Tömbök összehasonlítása tartalmuk alapján.
        // Arrays.fill(tomb, érték) -- Adott elemmel feltölti a tömböt.
        // Arrays.sort(tomb) -- Rendezi a tömbböt növekvő sorrendbe, nem másolatot ad vissza, hanem a tömböt amit adtunk, azt rendezi magát --> Helyben módosítja a tömböt.

        // HÁZIFELADAT:
        // MyUtils.reverse(tomb) -Helyben fordítja meg az elemek sorrendjét
        // MyUtils.sortDescending(tomb)

        System.out.println(Arrays.toString(MyUtils.reverse(five)));
    }

    static int[] getOneToFive() {
        int[] result = {1,2,3,4,5};
        return result;
    }

    static void modosit (int[] tomb) {
        tomb[0] = 100;
    }
}
