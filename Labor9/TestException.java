package Labor9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestException {
    static void main(String[] args) {
        int szamok[] = new int[]{0,6,8};
        //System.out.println("Az eredmény: "+szamok[3]); //Ez hibás lenne, így kivételt kell kezelni.
        //Kivételkezelést írunk, ami a try-catch
        try {
            System.out.println("Try indul");
            //Integer.parseInt("alma");
            //System.out.println(32154/szamok[0]);
            Scanner sc = new Scanner(new File("alma.txt")); // ha nincs lekezelve a Scanner exeptionje akkor aláhúzza, és hibának írja, hogy nincs lekezelve.
            System.out.println("Az eredmény: "+szamok[3]);
            System.out.println("Itt a try vége.");
        } catch (ArrayIndexOutOfBoundsException e) {    // Ha egyszer hibára fut a try, akkor átjön ide a catch-re, és vissza már nem megy. Azaz nem csak a hibát skippeli, hanem a tejes try-t.
            System.out.println("Az eredmény:" +0);
        } catch (FileNotFoundException e) {
            System.out.println("A file nem található.");
        } catch (Exception e) { // Ez minden hibát el tud kapni.
            System.out.println(e.toString());
        }


        System.out.println("ITt a program vége.");
    }
}
