package Labor9;

import Labor9.kivetel.HibasIranyException;

public interface Mozog {    // Az interface viselkedést/tulajdonságot modellez
    //Az osztály objektumot modellez.
    void felfele() throws HibasIranyException, Exception; // Body nélküli

    void lefele() throws HibasIranyException, Exception; // Fejlécben beépítjük azokat a kivteleket amiket tovább akarunk dobni és nem helyben kezeljük le. throws majd utána osztály.
}