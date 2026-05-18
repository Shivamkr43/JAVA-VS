abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void calculateSalary();

    void display() {
        System.out.println(name);
        System.out.println(id);
    }
}

class FullTimeEmployee extends Employee {

    int salary;

    FullTimeEmployee(String name, int id, int salary) {
        super(name, id);
        this.salary = salary;
    }

    void calculateSalary() {
        System.out.println(salary);
    }
}

class PartTimeEmployee extends Employee {

    int ratePerHour;

    PartTimeEmployee(String name, int id, int ratePerHour) {
        super(name, id);
        this.ratePerHour = ratePerHour;
    }

    void calculateSalary() {
        System.out.println(ratePerHour);
    }
}

public class Abstraction1 {

    public static void main(String[] args) {

        FullTimeEmployee f = new FullTimeEmployee("Krish Panwar", 4838, 5000);

        PartTimeEmployee p = new PartTimeEmployee("Mohal manghal", 5894, 2000);

        f.display();
        f.calculateSalary();

        p.display();
        p.calculateSalary();
    }
}