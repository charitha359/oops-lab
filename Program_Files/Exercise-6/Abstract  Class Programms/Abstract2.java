abstract class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    abstract void calculateSalary();

    void showDetails() {
        System.out.println("Employee: " + name);
    }
}
class FullTimeEmployee extends Employee {
    FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }

   void calculateSalary() {
        System.out.println(name + "'s full-time salary: $" + salary);
    }
}
class PartTimeEmployee extends Employee {
    int hoursWorked;

    PartTimeEmployee(String name, double salary, int hoursWorked) {
        super(name, salary);
        this.hoursWorked = hoursWorked;
    }
    void calculateSalary() {
        System.out.println(name + "'s part-time salary: $" + (salary * hoursWorked));
    }
}

public class Abstract2 {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Alice", 5000);
        Employee e2 = new PartTimeEmployee("Bob", 20, 100);

        e1.calculateSalary();
        e2.calculateSalary();
        e1.showDetails();
    }
}
