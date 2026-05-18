// Method Overriding with Super
class Parent2 {

    void display() {

        System.out.println("Parent Method");
    }
}

class Child2 extends Parent2 {

    void display() {

        super.display();

        System.out.println("Child Method");
    }
}

public class methodoverriding {
    public static void main(String[] args) {

        Child2 c = new Child2();

        c.display();
    }
}