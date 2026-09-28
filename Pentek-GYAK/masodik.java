import java.time.Year;

// Book class másik fájlban!!!!!!

class Person {
    public String name;
    public String eMail;
    public int yearOfBirth;

    public int howOldAreYou() {
        int currentYear = Year.now().getValue();
        return currentYear - yearOfBirth;
    }
}

// Objektum: Egy osztály konkrét példája. - Elkészített könyv például.

// Példány metódusok: Egy osztályon belül nem csak példányváltozók, hanem példány metódusok is szerepelhetnek. A példányváltozók az objektum állapotát írják le. A példány metódusok pedig az objektumok viselkedéséért felelnek.

// Konstruktor: Egy speciális metódus az osztályon belül. Amikor egy osztályt példányosítunk, akkor a konstruktor automatikusan lefut. Mire jó?: A konstruktor segítségével nagyon egyszerűen be tudjuk állítani egy objektum kezdő állapotát.

// this.változó: Speciális referencia, ami az adott objektumra mutat. Vagyis a this az adott objektumot jelenti. Segítségével az adott objektumra lehet hivatkozni.

public class masodik {      // Osztályok és objektumok
    static void main(String[] args) {
        //Book book1 = new Book("Hello!"); //Konstruktor meghívása, stringet adunk neki
        //book1.title = "Dune";
        //book1.author = "Frank Herbert";
        //book1.pages = 412;

        Book book2 = new Book("Alapítvány", "Asimov", 255);
        System.out.println("Konyv: "+book2.title +" "+book2.author + " " + book2.pages);

        System.out.println("# Java kód");
        //System.out.println(book1.title);
        System.out.println(book2.title);

        Person p1 = new Person();
        p1.name = "Anna";
        p1.eMail = "anna@hello.com";
        p1.yearOfBirth = 1983;

        System.out.println(p1.howOldAreYou());
        //vagy
        int eletkor = Year.now().getValue() - p1.yearOfBirth;
        System.out.println(eletkor);
    }
}
