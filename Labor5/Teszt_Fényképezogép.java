package Labor4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teszt_Fényképezogép {
    public static void rendez(List<Fényképezőgép> t) {
        for (int i=0; i<t.size()-1; i++) {      // Közvetlen rendezés
            for (int j=i+1; j<t.size(); j++) {  // i-edik elem +1-től indul
                if (t.get(i).getSzélesség() == t.get(j).getSzélesség()) {
                    if (t.get(i).getHegyekSzáma() == t.get(j).getHegyekSzáma()) {
                        if (t.get(i).getTípus().compareTo(t.get(j).getTípus())>0) { // Ha nem egyezik, akkor csere:
                            Fényképezőgép tmp = t.get(i);
                            t.set(i, t.get(j)); // i-edik helyre beállítom a j-edig elemet.
                            t.set(j, tmp);  // j-edik helyre bekerül az eddigi i-edik elem, amit elmentettünk a tmp változóba.

                        }
                    } else if (t.get(i).getHegyekSzáma() < t.get(j).getHegyekSzáma()) { //Növekvő sorrend
                        Fényképezőgép tmp = t.get(i);
                        t.set(i, t.get(j)); // i-edik helyre beállítom a j-edig elemet.
                        t.set(j, tmp);  // j-edik helyre bekerül az eddigi i-edik elem, amit elmentettünk a tmp változóba.
                    }

                } else if (t.get(i).getSzélesség() < t.get(j).getSzélesség()) {
                    Fényképezőgép tmp = t.get(i);
                    t.set(i, t.get(j)); // i-edik helyre beállítom a j-edig elemet.
                    t.set(j, tmp);  // j-edik helyre bekerül az eddigi i-edik elem, amit elmentettünk a tmp változóba.
                }
            }
        }
    }

    static void main(String[] args) {
        List<Fényképezőgép> li = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int sorok_száma = Integer.parseInt(sc.nextLine());

        for(int i=0;i<sorok_száma; i++) {
            String sor = sc.nextLine();
            String[] db = sor.split(":"); // split tömböt ad vissza, ebbe kerülnek a feladarabolt részek

            Fényképezőgép f = new Fényképezőgép(db[0], db[1]);  //Példányosítjuk, majd:
            li.add(f);  // Listához adjuk.
        }

        rendez(li);

        System.out.println("A megfelelő sorrend:");
        for(Fényképezőgép f : li) {
            System.out.println(f);
        }
    }
}

// ZH: osztályok, standard inputról olvasás, feldolgozás, file utils-os beolvasás, majd sorok feldolgozása