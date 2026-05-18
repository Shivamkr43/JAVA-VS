// Abstract Class
abstract class Bank1 {
    abstract void loan();
}

class SBI1 extends Bank1 {

    void loan() {
        System.out.println("Loan Approved");
    }
}

public class absclass {
    public static void main(String[] args) {

        SBI1 s = new SBI1();

        s.loan();
    }
}