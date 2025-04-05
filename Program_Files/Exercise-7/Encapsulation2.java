class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
            System.out.println("Marks updated successfully.");
        } else {
            System.out.println("Invalid marks. Enter between 0 and 100.");
        }
    }
}

public class Encapsulation2 {
    public static void main(String[] args) {
        Student s = new Student("Alice", 85);
        System.out.println(s.getName() + "'s Marks: " + s.getMarks());
        s.setMarks(95);
        System.out.println(s.getName() + "'s New Marks: " + s.getMarks());
    }
}
