package Labor4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test_Császár2 {
    static void beolvas(List<Császár> t) {
        Scanner sc = new Scanner(System.in);
        String nev;
        int ev;
        //int idx = 0; //tömb index -- de nincs rá szükség a listához.

        while ( (ev = sc.nextInt()) != 0) {
            nev = sc.next();
            Császár cs = new Császár(nev, ev);
            t.add(cs);  //Listához hozzáadás

            //t[idx++] = cs; //0. helyre berakja, majd növel. -- de nincs rá szükség a listához.
            //t[++idx] = cs; //Előbb növel, utána rakja bele, azaz az 1. helyre.
        }
    }

    static void main(String[] args) {
                                                //Alt+ENTER- beimportálja a csomagot.
        List<Császár> t = new ArrayList<>();    // Lista létrehozása
        beolvas(t);  //Lista ádatása


        //Császár min = t[0];  Tömbnél így kell
        Császár min = t.get(0); // Listában .get(0)-val lehet megadni az első elemet

        for (int i=1; i< t.size() ;i++) {   // t.size() adja vissza a lista méretét.
            if (min.getSzul_ev() > t.get(i).getSzul_ev()) {
                //min.setSzul_ev(t[i].getSzul_ev());  Akár lehet így is.
                min = t.get(i);
            }
        }
        System.out.println(min);
    }
}
