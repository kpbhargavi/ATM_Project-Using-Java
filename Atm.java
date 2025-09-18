public class Atm {
    private double balance;

    // default constructor
    public Atm() {
        this.balance = 10000; // initial balance
    }

    // getter & setter
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
