import java.util.Random;
import java.util.Scanner;

public class Gyak2 {
    public static boolean contains_one(String s, char ch) { //Ha a string 1x tartalmazza a chart: true
        return s.indexOf(ch) == s.lastIndexOf(ch); //Első és utolsó karakter ugyan az e?
    }

    public static void RoSamBo() { //Usertől kérünk választ, gép random választ, és +1 pont a nyerőnek, addig megy, amíg nincs "vége". Ha vége, kiírja a pontokat.
        String player1;
        String player2;

        int score1 = 0;
        int score2 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem a következőt: ");

        while (! (player1 = sc.nextLine()).equals("vege") ) {
            Random rnd = new Random();
            int j2 = rnd.nextInt(3);

            if (j2 == 0) {
                player2 = "ko";
            } else if (j2 == 1) {
                player2 = "papir";
            } else {
                player2 = "ollo";
            }
            System.out.println("A gép válasza: "+player2);

            if (player1.equals("ko") && player2.equals("papir")) {
                score2++; //unáris operátor
            } else if (player1.equals("ko") && player2.equals("ollo")) {
                score1++; //unáris operátor
            }

            if (player1.equals("papir") && player2.equals("ko")) {
                score1++; //unáris operátor
            } else if (player1.equals("papir") && player2.equals("ollo")) {
                score2++; //unáris operátor
            }

            if (player1.equals("ollo") && player2.equals("ko")) {
                score2++; //unáris operátor
            } else if (player1.equals("ollo") && player2.equals("papir")) {
                score1++; //unáris operátor
            }

            System.out.println("Kérem a következőt: ");
        }

        if(score1 > score2) {
            System.out.println("User nyert!");
        } else if (score1 < score2) {
            System.out.println("Gép nyert!");
        } else {
            System.out.println("Döntetlen!");
        }
    }

    static void main(String[] args) {
        String s1 = "Welcome to Java";
        String s2 = s1;
        String s3 = "Welcome to Java";
        String s4 = new String("Welcome to Java");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s4);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s4));
        System.out.println(s1.compareTo(s4));
        System.out.println(s1.compareTo("Welcome to Tava")); // -10, mert a T és J között -10 hely van.

        System.out.println(s1.charAt(0));   //Adott indexen lévő érték kiírása: W

        String dupla = "";
        for (int i=0; i<s1.length(); i++) {
            dupla = dupla + s1.charAt(i) + s1.charAt(i);    //Duplázunk minden karaktert
        }
        System.out.println(dupla);

        System.out.println("Karakter első előfordulása: "+ s1.indexOf("a"));
        System.out.println("Karakter utolsó előfordulása: "+ s1.lastIndexOf("a"));

        String s5 = "Halibali".replace("a", "u");
        System.out.println(s5);
        System.out.println("Halibali".repeat(3));

        String s6 = "Halibali".substring(2,6);
        System.out.println(s6);

        char [] str = "Halibali".toCharArray();
        System.out.println(s1.contains("to"));

        System.out.println(contains_one("Halibali", 'b'));

        RoSamBo();
    }
}
