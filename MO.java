// Method Overriding
class Vehicle {
    void run() {
        System.out.println("Vehicle Running");
    }
}

class Bike extends Vehicle {
    void run() {
        System.out.println("Bike Running");
    }
}

public class MO {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.run();
    }
}