import java.util.Date;

public class Account {
    private int id; // Példányszintű, minden példánynak külön van.
    private double balance;
    private static double aIR; // Osztályszintű, statikus, azaz példányonként nem változik, hanem ugyan az.
    private Date dateCreated; // Date-et be kell importálni, java.util csomagot!

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
        Account.aIR = aIR;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    // Constructor generálása Alt + Insert

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public Account() {
    }
}
