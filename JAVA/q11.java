import java.util.Scanner;

// Base class: Student
class q11_Student {
    String name;
    int rollNo;

    // Method to read student details
    void readStudentDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
    }

    // Method to display student details
    void displayStudentDetails() {
        System.out.println("\nStudent Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}

// Derived class: Mark (inherits Student)
class q11_Mark extends q11_Student {
    int[] marks = new int[5]; // Array to store 5 subject marks
    int total = 0;
    double average;

    // Method to read marks
    void readMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i]; // Calculate total
        }
        average = total / 5.0; // Calculate average
    }

    // Method to display marks, total, and average
    void displayResult() {
        displayStudentDetails(); // Display student details
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println(average >= 40 ? "Result: PASS" : "Result: FAIL");
    }
}

// Main class
public class q11 {
    public static void main(String[] args) {
        q11_Mark student = new q11_Mark(); // Create object of Mark (inherits Student)
        student.readStudentDetails(); // Read student details
        student.readMarks(); // Read marks
        student.displayResult(); // Display result
    }
}
