package Labor5;

import java.util.Scanner;

public class Tower {

    public static int process (String h) {
        int sum = 0;

        for (int i=0;i<h.length()-1; i++) {
            //int currentHeight = h.charAt(i); ASCII kód!
            //int nextHeight = h.charAt(i+1);  ASCII kód!

            int currentHeight = Character.getNumericValue(h.charAt(i)); // ASCII kód!
            int nextHeight = Character.getNumericValue(h.charAt(i+1));  // ASCII kód!
            sum += Math.abs(currentHeight-nextHeight);
        }
        return sum;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a magasságokat: ");
        String heights = sc.nextLine();

        System.out.println("Válasz: "+ process(heights));
    }

}
