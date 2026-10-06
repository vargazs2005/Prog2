package Labor5;

public class Test_SzámtaniSorozat {
    public static boolean checkArithmeticSequence (int [] t) {
        if(t.length<3) {
            return true;
        }
        int diff = t[1] - t[0];

        for (int i=2; i<t.length; i++) {
            if(t[i] - t[i-1] != diff) {
                return false;
            }
        }
        return true;
    }

    static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Adjon meg legalább egy paramétert!");
            System.exit(1);
        }

        int [] numbers = new int[args.length];
        for (int i=0; i< args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        System.out.println("Válasz: " + checkArithmeticSequence(numbers));
    }
}
