package Labor9;

import Labor9.kivetel.HibasIranyException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    static void main(String[] args) {
        List<Lift> lis = new ArrayList<>();

        try {
            Scanner sc = new Scanner(new File("input.txt"));
            int liftek_szama = Integer.parseInt(sc.nextLine()); // N egész szám

            for (int i = 0; i<liftek_szama; i++) {
                int emeletek_szama;
                try {
                    emeletek_szama = Integer.parseInt(sc.nextLine());   // N darab lift, azoknak emeleteinek száma.
                } catch (Exception e) {
                    //System.out.println(e.toString());
                    emeletek_szama = 10;
                }
                lis.add(new Lift(emeletek_szama));
            }

            while (sc.hasNextLine()) {  // Amíg van sor, addig megy.
                String sor = sc.nextLine();     // Bekéri az adott sort.
                String [] parancs = sor.split(";");     // Szétszedjük pontosvessző mentén.

                int idx;    // Try-on belül lokális változók vannak, kívülről nem elérhető, ezért külön kell deklarálni.
                try {
                    idx = Integer.parseInt(parancs[0]) - 1; // -1, mert a liftek sorszáma 0-tól indul.
                } catch (Exception e) {
                    //System.out.println(e.toString());
                    continue;   // Ha hibára fut, azaz nincs index, akkor kihagyja a jelenlegi sort, és megy a következőre.
                }

                System.out.println("Parancs előtt: " + lis.get(idx));

                if (parancs[1].equals("fel")) { // Második a parancs, ezt vizsgáljuk.
                    try {
                        lis.get(idx).felfele(); // Nincs alapból lekezelve a felfele(), ezért írunk sima Exception e catch-et.
                        System.out.println("Parancs után: " + lis.get(idx));
                        System.out.println("");
                    } catch (HibasIranyException e) {
                        System.out.println(e.toString());
                    } catch (Exception e){
                        System.out.println(e.toString());
                    }
                } else {
                    try {
                        lis.get(idx).lefele(); // Nincs alapból lekezelve a lefele(), ezért írunk sima Exception e catch-et.
                        System.out.println("Parancs után: " + lis.get(idx));
                        System.out.println("");
                    } catch (HibasIranyException e) {
                        System.out.println(e.toString());
                    } catch (Exception e){
                        System.out.println(e.toString());
                    }
                }
                // Ha hiba van, akkor kidob a catchba, és tovább nem megy tovább a kód. Így lehet csak 1 futás hibából.
                // Ezért a fel / le vizsgálat után is írunk egy try - catch-et, így ha egy el is dobódik, a többi még tovább fut.
            }

        } catch (FileNotFoundException e) {
            //System.out.println(e.getMessage());
            System.out.println("Kérem ellenőrizze a file-t!");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
