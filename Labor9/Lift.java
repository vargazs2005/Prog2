package Labor9;

import Labor9.kivetel.HibasIranyException;

import java.util.Random;

public class Lift implements Mozog {        // Piros izzó, implement methods, és mindkét metódus kiválasztása.
    private int emeletek_szama;
    private int aktualis_emelet;

    public Lift(int emeletek_szama) {
        this.emeletek_szama = emeletek_szama;
        Random rnd = new Random();
        this.aktualis_emelet = rnd.nextInt(1, this.emeletek_szama+1);
    }

    @Override
    public void felfele() throws HibasIranyException, Exception {
        Random rnd = new Random();
        int dobott_szam = rnd.nextInt(100);
        int elromlik = 0;

        if(dobott_szam == elromlik) {
            throw new Exception("A lift elromlott."); // Példányosítani kell az Exceptiont.
        }

        if (this.aktualis_emelet < this.aktualis_emelet) {
            this.aktualis_emelet++;
        } else {
            throw new HibasIranyException("Nem lehet felfele menni.");
        }
    }

    @Override
    public void lefele() throws HibasIranyException, Exception {
        Random rnd = new Random();
        int dobott_szam = rnd.nextInt(100);
        int elromlik = 0;

        if(dobott_szam == elromlik) {
            throw new Exception("A lift elromlott."); // Példányosítani kell az Exceptiont.
        }

        if (this.aktualis_emelet > 1) {
            this.aktualis_emelet--;
        } else {
            throw new HibasIranyException("Nem lehet lefelé menni.");
        }
    }

    @Override
    public String toString() {
        return "Lift{" +
                "emeletek_szama=" + emeletek_szama +
                ", aktualis_emelet=" + aktualis_emelet +
                '}';
    }
}
