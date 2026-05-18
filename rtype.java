//  Object as Return Type
class Student1 {

    int id = 101;
}

public class rtype {

    Student1 getStudent() {

        return new Student1();
    }

    public static void main(String[] args) {

        rtype t = new rtype();

        Student1 s = t.getStudent();

        System.out.println(s.id);
    }
}