public class matek {
    static void main(String[] args) {
        System.out.println(Math.abs(-5));
        System.out.println(Math.max(3,8));

        //Nem lehet példányosítani a Math osztályt, mert minden metódus statikus benne.
        //Nem kell importálni se a Math osztályt, mert a java.lang része, ami automatikusan importálva van minden java fájlba.

        System.out.println(MyUtils.duplaz(8));
        System.out.println(MyUtils.strlen("abcd"));
        //MyUtils asd = new MyUtils(); --letiltva

        // C beli const, java megfelelője: "final": Egyszerű (primitív) típusok esetén a változót konstanssá tudjuk tenni. Vagyis miután inicializáltuk utána nem lehet módosítani az értékét. Referencia típusú változók esetén nem úgy működik ahogy elsőre gondolnánk... Folytatás jövő héten.

        final int n = 4;
        // ++n;  -hiba, mivel konstans (final), ezért nem változtatható az értéke.
        System.out.println(n);

        System.out.println(triplaz(5));

        // Nevesített konstans:
        // C-ben: #define MAX 10
        // Java-ban: Csak osztályon belül helyezhető el, kinézete:
        // public final static int MAX = 10;

        System.out.println(MyUtils.PI);
    }

    static int triplaz(final int n) {
        // ++n; -- hibás, nem lehet módosítani, mert final!
        return 3*n;
    }
}
