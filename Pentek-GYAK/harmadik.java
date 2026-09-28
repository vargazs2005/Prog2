class Teglalap {
    private int aOldal;
    private int bOldal;

    public Teglalap(int a, int b) {
        this.aOldal = a;
        this.bOldal = b;
    }

    public int terulet() {
        return aOldal*bOldal;
    }

    public int getaOldal() {
        return aOldal;
    }

    public int getbOldal() {
        return bOldal;
    }
}

public class harmadik {

    // Osztály (statikus) metódus: olyan metódus ami magához az osztályhoz tartozik. Adott metódusra az osztály nevével lehet hivatkozni. Vagyis nincs szükség egyetlen példányra sem ahhoz, hogy egy ilyen metódust meghívjunk.
    // Példánymetódusok példányváltozókkal dolgoznak. - Adott objektum saját metódusa.
    //
    static void main(String[] args) {
        Teglalap t1 = new Teglalap(3, 5);
        System.out.println(t1.terulet());

        Teglalap t2 = new Teglalap(t1.getaOldal()*2, t1.getbOldal()*2);
        System.out.println(t2.terulet());
    }

}
