// Runtime Polymorphism
class Animal2 {

    void eat() {
        System.out.println("Animal Eating");
    }
}

class Cat1 extends Animal2 {

    void eat() {
        System.out.println("Cat Drinking Milk");
    }
}

public class rtpolymorphism {
    public static void main(String[] args) {

        Animal2 a = new Cat1();

        a.eat();
    }
}