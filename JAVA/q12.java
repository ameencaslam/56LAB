import java.util.Scanner;

// Class to represent a Complex Number
class q12_Complex {
    double real, imag;

    // Constructor to initialize complex number
    q12_Complex(double r, double i) {
        this.real = r;
        this.imag = i;
    }

    // Method to add two complex numbers
    q12_Complex add(q12_Complex c) {
        return new q12_Complex(this.real + c.real, this.imag + c.imag);
    }

    // Method to display the complex number
    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

// Main class
public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first complex number
        System.out.print("Enter real part of first complex number: ");
        double r1 = sc.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double i1 = sc.nextDouble();

        // Input second complex number
        System.out.print("Enter real part of second complex number: ");
        double r2 = sc.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double i2 = sc.nextDouble();

        // Create two complex number objects
        q12_Complex c1 = new q12_Complex(r1, i1);
        q12_Complex c2 = new q12_Complex(r2, i2);

        // Add the complex numbers
        q12_Complex sum = c1.add(c2);

        // Display result
        System.out.print("Sum of Complex Numbers: ");
        sum.display();
    }
}
