// Array Object
class Student {
    int id;

    Student(int id) {
        this.id = id;
    }
}

public class OBJ {
    public static void main(String[] args) {

        Student s1 = new Student(1);
        Student s2 = new Student(2);

        Student arr[] = {s1, s2};

        for (Student s : arr) {
            System.out.println(s.id);
        }
    }
}