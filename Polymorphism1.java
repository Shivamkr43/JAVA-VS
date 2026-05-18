//  Polymorphism
class Parent {
    void show() {
        System.out.println("Parent Class");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child Class");
    }
}

public class Polymorphism1 {
    public static void main(String[] args) {
        Parent p = new Child();

        p.show();
    }
}