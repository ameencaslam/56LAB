import java.util.Scanner;

// Interface Volume
interface Volume {
    double PI = 3.14159;  // Constant value for π
    
    void readData();      // Method to read input values
    void dispVolume();    // Method to display volume
}

// Sphere class implementing Volume interface
class Sphere implements Volume {
    double radius;

    public void readData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        radius = sc.nextDouble();
    }

    public void dispVolume() {
        double volume = (4.0 / 3.0) * PI * Math.pow(radius, 3);
        System.out.println("Volume of Sphere: " + volume);
    }
}

// Cylinder class implementing Volume interface
class Cylinder implements Volume {
    double radius, height;

    public void readData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        radius = sc.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        height = sc.nextDouble();
    }

    public void dispVolume() {
        double volume = PI * Math.pow(radius, 2) * height;
        System.out.println("Volume of Cylinder: " + volume);
    }
}

// Main class
public class q16 {
    public static void main(String[] args) {
        Sphere sph = new Sphere();
        Cylinder cyl = new Cylinder();

        sph.readData();
        sph.dispVolume();

        cyl.readData();
        cyl.dispVolume();
    }
}
