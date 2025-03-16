// Abstract class Shape
abstract class Shape {
    abstract void area();
}

// Two-dimensional shape class
abstract class TwoDim extends Shape {}

// Three-dimensional shape class
abstract class ThreeDim extends Shape {}

// Square class derived from TwoDim
class Square extends TwoDim {
    double side;
    
    Square(double side) {
        this.side = side;
    }

    void area() {
        System.out.println("Square Area: " + (side * side));
    }
}

// Triangle class derived from TwoDim
class Triangle extends TwoDim {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    void area() {
        System.out.println("Triangle Area: " + (0.5 * base * height));
    }
}

// Sphere class derived from ThreeDim
class Sphere extends ThreeDim {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    void area() {
        System.out.println("Sphere Surface Area: " + (4 * Math.PI * radius * radius));
    }
}

// Cube class derived from ThreeDim
class Cube extends ThreeDim {
    double side;

    Cube(double side) {
        this.side = side;
    }

    void area() {
        System.out.println("Cube Surface Area: " + (6 * side * side));
    }
}

// Main class
public class q15 {
    public static void main(String[] args) {
        Square sq = new Square(5);
        Triangle tri = new Triangle(4, 6);
        Sphere sph = new Sphere(3);
        Cube cub = new Cube(4);

        sq.area();
        tri.area();
        sph.area();
        cub.area();
    }
}
