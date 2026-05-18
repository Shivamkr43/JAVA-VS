//  Multilevel Inheritance
class Person {
    void show() {
        System.out.println("Person");
    }
}

class Teacher extends Person {
    void teach() {
        System.out.println("Teaching");
    }
}

class MathsTeacher extends Teacher {
    void math() {
        System.out.println("Math Teacher");
    }
}

public class inh2 {
    public static void main(String[] args) {

        MathsTeacher m = new MathsTeacher();

        m.show();
        m.teach();
        m.math();
    }
}