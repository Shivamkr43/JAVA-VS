//  Employee Object Array
class Employee3 {

    int id;
    String name;

    Employee3(int id, String name) {

        this.id = id;

        this.name = name;
    }

    void show() {

        System.out.println(id + " " + name);
    }
}

public class arr6 {
    public static void main(String[] args) {

        Employee3 e1 = new Employee3(1, "Krish");

        Employee3 e2 = new Employee3(2, "Rahul");

        Employee3 arr[] = {e1, e2};

        for(Employee3 e : arr) {

            e.show();
        }
    }
}