public class test_labor3 {
    static void main(String[] args) {
        Hallgato h1 = new Hallgato("Deb Ella", "TRZ56", 3.7, 3); // new ...Konstruktor név
        h1.koszon();
        //h1.nev = "Plusznév"; // Nem működik, mert "private". Szóval csak osztályon belülről érhető el.
        h1.koszon(2);

        System.out.println(h1.getNev());
        h1.setNev("Borond Ella");
        System.out.println(h1.getNev());

        System.out.println(h1); // Referenciacím, ahol található a Hallgató record.
                                // Alt + Insert toString a Hallgatok.java-ban, és akkor nem ref címet ír hanem stringet.
        Hallgato h2 = new Hallgato("Mekk Elek", "TRF23", 3, 2);

        System.out.println("Egyenlőek-e a hallgatók: " + h1.equals(h2));
    }
}
