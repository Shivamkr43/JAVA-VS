class Bank {
    void interestRate() {
        System.out.println("interest rate");
    }
}
class SBI extends Bank {
    void interestRate() {
        System.out.println("SBI interest rate is 10%");
    }
}
class HDFC extends Bank {
    void interestRate() {
        System.out.println("HDFC interest rate is 12%");
    }
}
class ICICI extends Bank {
    void interestRate() {
        System.out.println("ICICI interest rate is 14%");
    }
}
public class Inheritance1 {
    public static void main(String[] args) {
        Bank b = new SBI();
        b.interestRate();
        
        b = new HDFC();
        b.interestRate();

        b = new ICICI();
        b.interestRate();
    }
}