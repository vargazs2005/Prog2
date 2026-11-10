package Labor9;

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
                int emeletek_szama = Integer.parseInt(sc.nextLine());   // N darab lift, azoknak emeleteinek száma.
                lis.add(new Lift(emeletek_szama));
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
