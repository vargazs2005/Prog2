package Labor4;

public class Fényképezőgép {
    private String típus;
    private String felvétel;

    public Fényképezőgép(String típus, String felvétel) {
        this.típus = típus;
        this.felvétel = felvétel;
    }

    public String getTípus() {
        return típus;
    }

    public String getFelvétel() {
        return felvétel;
    }

    //Panoráma szélesség:
    public int getSzélesség() {
        return this.felvétel.length();  //Felvétel hossza
    }

    public int getHegyekSzáma() {
        int db = 0;
        for (int i=0; i < this.felvétel.length()-1; i++) {  // -1 mert a kövi karakterig megyünk, és túlfutnánk.
            if (this.felvétel.charAt(i) == '/' && this.felvétel.charAt(i+1) == '\\')  {    // a \ speciális karakter, szóval kettőt kell írni, mert az számít 1 darab \-nek
                db++;
            }
        }
        return db;
    }

    @Override
    public String toString() {
        return this.típus;
    }
}
