class Bank {

    void interestRate() {
        System.out.println("Bank Interest");
    }
}

class SBI extends Bank {

    @Override
    void interestRate() {
        System.out.println("SBI interest rate is 10%");
    }
}

class HDFC extends Bank {

    @Override
    void interestRate() {
        System.out.println("HDFC interest rate is 12%");
    }
}

class ICICI extends Bank {

    @Override
    void interestRate() {
        System.out.println("ICICI interest rate is 14%");
    }
}
abstract class Employee {

    String name;
    int id;

    // Constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract Method
    abstract void calculateSalary();

    // Normal Method
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}
// Full Time Employee Class
class FullTimeEmployee extends Employee {

    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    void calculateSalary() {
        displayDetails();
        System.out.println("Full Time Salary: " + monthlySalary);
    }
}


// Part Time Employee Class
class PartTimeEmployee extends Employee {

    int hoursWorked;
    double ratePerHour;

    PartTimeEmployee(String name, int id, int hoursWorked, double ratePerHour) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    void calculateSalary() {

        double salary = hoursWorked * ratePerHour;

        displayDetails();
        System.out.println("Part Time Salary: " + salary);
    }
}



public class Main {

    public static void main(String[] args) {

        // Bank Objects
        SBI sbi = new SBI();
        HDFC hdfc = new HDFC();
        ICICI icici = new ICICI();

        System.out.println("---- Bank Interest Rates ----");

        sbi.interestRate();
        hdfc.interestRate();
        icici.interestRate();


        // Employee Objects
        System.out.println("\n---- Employee Details ----");

        FullTimeEmployee emp1 =
                new FullTimeEmployee("Rahul", 101, 50000);

        PartTimeEmployee emp2 =
                new PartTimeEmployee("Aman", 102, 5, 500);

        emp1.calculateSalary();

        System.out.println();

        emp2.calculateSalary();
    }
}
