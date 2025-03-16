public class q1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        System.out.println("Quotient: " + (b != 0 ? (a / b) : "Error, Division by Zero"));
        System.out.println("Remainder: " + (b != 0 ? (a % b) : "Error, Division by Zero"));
    }
}
