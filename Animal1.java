// Inheritance
class Animal {
    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog Bark");
    }
}

public class Animal1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.bark();
    }
}