//public elhagyható, de maradhat is..
class MyUtils {

    //Példányosítás letiltása: (konstruktor priváttá tétele)
    private MyUtils() {
        // Nem példányosítható.
    }

    public final static double PI = 3.14159;

    public static void reverse(int[] tomb) {
        int i = 0;
        int j = tomb.length-1;

        while (i<j) {
            int temp = tomb[i];
            tomb[i] = tomb[j];
            tomb[j] = temp;
            i++;
            j--;
        }
    }

    public static int duplaz (int n) {
        return n*2;
    }

    public static int strlen (String s) {
        return s.length();
    }
}
