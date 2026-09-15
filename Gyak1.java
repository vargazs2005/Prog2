public class Gyak1 {
    static int lnko(int a, int b) {
        int r; //maradék
        do {
            r = a % b;
            a = b;
            b = r;
        } while (r != 0);

        return a;
    }

    static void szokoev(int ev1, int ev2) {
        //for ( ; ; ) {  Ez is működőképes, csak ez végtelen ciklus!
        //}

        for (int i=ev1; i<=ev2; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                System.out.println("Szökőév="+i);
            }
        }
    }

    static boolean is_prim(int szam) {
        if (szam < 2)
            return false;
        for(int oszto = 2; oszto <= szam/2; oszto++) {
            if (szam % oszto == 0) {
                return false;       //Nem prím, van valós osztó
            }
        }
        return true;  //Nem talált osztót, így prím.
    }

    static boolean is_primGyuru(int []tomb) {
        if(tomb.length <2)
            return false;
        for(int i=0; i<=tomb.length-2; i++) {
            int osszeg = tomb[i] + tomb[i+1];
            if(! is_prim(osszeg)) {
                return false;
            }
        }
        return is_prim(tomb[0] + tomb[tomb.length-1]);
    }

    static void main(String[] args) {  //psvma - ENTER
        System.out.println("lnko=" +lnko(360,225)); //sout - ENTER, a számokhoz magától szújra be az "a, b"-t
        //System.out.print(); ln nélkül nem rak új sort a végére!

        szokoev(1890, 2026);

        //int t[] = {1,4,3,2};  Statikus tömb
        int t[] = new int[4];   //4 elemű tömb deklarálása. C-ben ilyen volt: int t[4];
        t[0] = 1;
        t[1] = 4;
        t[2] = 3;
        t[3] = 2;


        System.out.println("Prim gyűrű? "+is_primGyuru(t));
    }
    //Futtatásra hibát ír, mert az lnko nem statikus. Elé kell írni az int lnk(int a, int b) sor elé, hogy static.
}
