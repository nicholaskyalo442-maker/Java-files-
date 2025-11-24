NAME: NICHOLAS KYALO 
REG NO: S08-8425-2024

// Student Class
class Student {
    private String name;
    private double marks;

    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name + ", Marks: " + marks);
    }

    public double getMarks() {
        return marks;
    }
}

// GradeCalculator Class
class GradeCalculator {
    public String calculateGrade(double marks) {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "D";
    }
}

// MainApp Class
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student marks: ");
        double marks = scanner.nextDouble();

        // Create Student object
        Student student = new Student(name, marks);
        GradeCalculator calculator = new GradeCalculator();

        // Calculate grade and display details
        String grade = calculator.calculateGrade(marks);
        student.displayDetails();
        System.out.println("Calculated Grade: " + grade);
    }
}