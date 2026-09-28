public class elso {
    static void main(String[] args) {
        //1.
        //boolean ok;
        //ok = true;

        //boolean ok = true;
        //System.out.println("OK értéke: "+ok);

        //2. Hibát dob, nem memóriaszemetet..
        //int z;
        //System.out.println(z);

        //3. _ segít olvasni, de a kiíratás normális.
        //int big = 100_000;  // output: 100000
        //System.out.println(big);

        //4. Túl nagy szám kiíratása esetén a típus long és a szám végére "L" kell:
        //long big = 123456789012L;
        //System.out.println(big);

        //5. Double - float: kell a kis "f" a szám végére.
        //float vmi = 6.78f;
        //vagy
        //float vmi = (float)6.78;
        //System.out.println(vmi);

        //6. String:
        //String text = "hello";
        //System.out.println(text);

        //7. Csak referencia értékhez lehet null-t rendelni, így az "a"-hoz nem lehet.
        //int a = 3;
        //a = null;

        int[] tomb1 = new int[3];
        tomb1[0] = 1;
        tomb1[1] = 2;
        tomb1[2] = 3;

        //int[] tomb2 = tomb1;
        int[] tomb2 = new int[3];
        tomb2 = tomb1;
        tomb2[0] = 100;

        System.out.println(tomb1[0]);
        System.out.println(tomb2[0]);
    }
}