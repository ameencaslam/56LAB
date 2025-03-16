import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Calculate HCF using the Euclidean algorithm
        int hcf = findHCF(num1, num2);
        
        // Calculate LCM using the formula: LCM * HCF = num1 * num2
        int lcm = (num1 * num2) / hcf;

        // Display results
        System.out.println("HCF: " + hcf);
        System.out.println("LCM: " + lcm);

        sc.close();
    }

    // Function to find HCF using recursion (Euclidean Algorithm)
    public static int findHCF(int a, int b) {
        return (b == 0) ? a : findHCF(b, a % b);
    }
}
