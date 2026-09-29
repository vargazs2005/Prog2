package Labor4;

import java.util.Scanner;

public class Test_Császár {
    static int beolvas(Császár t[]) {
        Scanner sc = new Scanner(System.in);
        String nev;
        int ev;
        int idx = 0; //tömb index

        while ( (ev = sc.nextInt()) != 0) {
            nev = sc.next();
            Császár cs = new Császár(nev, ev);
            t[idx++] = cs; //0. helyre berakja, majd növel.
            //t[++idx] = cs; //Előbb növel, utána rakja bele, azaz az 1. helyre.
        }
        return idx;
    }

    static void main(String[] args) {
        Császár t[] = new Császár[100];

        int meret = beolvas(t);

        Császár min = t[0];
        for (int i=1; i<meret;i++) {
            if (min.getSzul_ev() > t[i].getSzul_ev()) {
                //min.setSzul_ev(t[i].getSzul_ev());  Akár lehet így is.
                min = t[i];
            }
        }
        System.out.println(min);
    }
}
