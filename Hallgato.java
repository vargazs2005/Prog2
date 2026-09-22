import java.util.Objects;

public class Hallgato {
    private String nev;     // Private csak osztályon belül érhető el.
    private String nkod;    // Public bárhonnan elérhető.
    private double atlag;
    private int evfolyam;

    public void koszon() {      //Metódus: eljárás vagy függvény ami osztályban van.
        System.out.println("Jó napot tanár úr!");
    }

    public void koszon(int n) {     //Osztály: Objektum tervrajza, abszrakt adattípus - új adattípust definiál a nyelvben.
                                    //Metódus: eljárás vagy függvény ami osztályban van.
                                    //Túl lehet terhelni: Nevük lehet ugyan az, csak különböző a paraméter lista vagy paraméter típus kell neki!
                                    //Egységbe zárás elve: osztály egységbe zárja az objektum tulajdonságait és viselkedésmintáit.
        for (int i = 0; i<n;i++) {
            System.out.println("Csáó Bella!");
        }
    }

    public Hallgato(String n, String nk, double a, int e) { //Speciális metódus: konstruktor                                            //Felépíti/Létrehozza az objektumot a memóriába.
                                    //Inicializálja is az objektumot - kezdőállapotba kerül.
        this.nev = n;
        this.nkod = nk;
        this.atlag = a;
        this.evfolyam = e;

    }

    public String getNev() {    // Publikus lekérdezés: getter
                                // Osztályon belül eléri az attribútumot, és vissza tudja adni kívülre.
        return this.nev;
    }
    public void setNev(String s) {  // Publikus beállítás: setter
                                    // Osztályon belül át tudja írni a privát attribútumot is kívülről kérve.
        this.nev = s;
                                    // Metódusok 95%-ban publikusak, Attribútumok privátak.
    }

    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // Alt + Insert, majd "Getter and Setter"
    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    public String getNkod() {
        return nkod;
    }

    public void setNkod(String nkod) {
        this.nkod = nkod;
    }

    public double getAtlag() {
        return atlag;
    }

    public void setAtlag(double atlag) {
        this.atlag = atlag;
    }

    public int getEvfolyam() {
        return evfolyam;
    }

    public void setEvfolyam(int evfolyam) {
        this.evfolyam = evfolyam;
    }

    @Override                       // Alt + Insert, "toString"
    public String toString() {      // System.out.println(h1); <-- referenci cím helyett String megjelenítése.
        return "Hallgato{" +
                "nev='" + nev + '\'' +
                ", nkod='" + nkod + '\'' +
                ", atlag=" + atlag +
                ", evfolyam=" + evfolyam +
                '}';
    }

    //Egyenlőség vizsgálat: Alt + Insert, "equals() and hashCode()"
    //Kód visszatörlése csak a public boolean marad. (if törlés)

    @Override
    public boolean equals(Object o) {   // Object: őstípus, minden típus object a java-ban.
        if ( o == null || !(o instanceof Hallgato)) {   //Ha nem létezik, vagy nem Hallgato osztályú, akkor biztos nem jó.
            return false;
        }

        Hallgato other = (Hallgato) o; //o-t típuskonverzióval/típuskényszerítéssel Hallgato típusúvá kényszerítem.
        return this.nkod.equals(other.getNkod()); // Ez a nkód egyenlő-e a másik kódjával.
    }

    @Override
    public int hashCode() {
        return Objects.hash(nev, nkod, atlag, evfolyam);
    }
}
