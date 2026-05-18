//  Multiple Objects
class Mobile1 {

    String name;

    Mobile1(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name);
    }
}

public class multiobject {
    public static void main(String[] args) {

        Mobile1 m1 = new Mobile1("Samsung");

        Mobile1 m2 = new Mobile1("iPhone");

        m1.display();

        m2.display();
    }
}