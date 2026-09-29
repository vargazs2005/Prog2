import java.util.Date;

public class Account {
    private int id; // Példányszintű, minden példánynak külön van.
    private double balance;
    private static double aIR = 0; // Osztályszintű, statikus, azaz példányonként nem változik, hanem ugyan az. Kezdőértéket adunk neki.
    private Date dateCreated; // Date-et be kell importálni, java.util csomagot!
    public static int account_db=0;

    // Alt + Insert, Getted and Setter-ek generálása.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getaIR() {
        return aIR;
    }

    public static void setaIR(double aIR) {
        Account.aIR = aIR;      //Osztályszintű (statikus) változókra az osztály nevét használjuk.
        //this.balance = 2;     //A példányváltozókhoz meg this. használjuk.
        //Fordítva működik, példányszintű eljárásban lehet statikus elemet használni.
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    // Constructor generálása Alt + Insert

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
        Account.account_db++;
    }

    public Account() {
        this.balance = 0;
        this.id = 0;
        this.dateCreated = new Date();
        Account.account_db++;
    }

    public void deposit(double money) {
        this.balance += money;
    }

    public void withdraw(double money) {
        this.balance -= money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
