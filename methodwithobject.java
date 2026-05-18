//  Method with Object
class Student2 {

    int marks = 90;
}

public class methodwithobject {

    void display(Student2 s) {

        System.out.println(s.marks);
    }

    public static void main(String[] args) {

        Student2 s = new Student2();

        methodwithobject obj = new methodwithobject();

        obj.display(s);
    }
}