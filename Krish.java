class Account {
    private double balance;

    public void setBalance(double amount) {
        balance = amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class Krish {
    public static void main(String[] args) {
        Account a = new Account();
        
        a.setBalance(5000.50);
        
        System.out.println(a.getBalance());
    }
}
