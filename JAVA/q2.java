public class q2 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide three sides of the triangle.");
            return;
        }

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        // Check if valid triangle and calculate area
        if (a + b > c && a + c > b && b + c > a) {

            // Check the type of triangle
            if (a == b && b == c) System.out.println("Equilateral Triangle");
            else if (a == b || b == c || a == c) System.out.println("Isosceles Triangle");
            else System.out.println("Scalene Triangle");

            double s = (a + b + c) / 2; // Semi-perimeter
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.printf("Area: %.2f\n", area);
        } else {
            System.out.println("Invalid triangle.");
        }
    }
}
