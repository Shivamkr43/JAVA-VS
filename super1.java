//  Super Keyword
class Parent1 {
    int x = 100;
}

class Child1 extends Parent1 {

    int x = 50;

    void show() {
        System.out.println(super.x);
    }
}

public class super1{
    public static void main(String[] args) {

        Child1 c = new Child1();

        c.show();
    }
}