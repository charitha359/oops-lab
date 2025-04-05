
class Person {

    String firstName;
    String lastName;
    

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    

    public String getFullName() {
        return firstName + " " + lastName;
    }
    
   
    public void greet() {
        System.out.println("Hello, " + getFullName() + "!");
    }
}


class Employee extends Person {

    String jobTitle;
    
  
    public Employee(String firstName, String lastName, String jobTitle) {
  
        super(firstName, lastName);
        this.jobTitle = jobTitle;
    }
    

    public void work() {
        System.out.println(getFullName() + " is working as a " + jobTitle + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        
        Employee employee = new Employee("John", "Doe", "Software Engineer");
        
        
        System.out.println("Full Name: " + employee.getFullName());
        employee.greet(); 
        
    
        employee.work();
    }
}
