class q14_VolumeCalculator {
    // Volume of Cube: side³
    double volume(double side) {
        return side * side * side;
    }

    // Volume of Rectangular Box: length × width × height
    double volume(double length, double width, double height) {
        return length * width * height;
    }

    // Volume of Cylinder: π × radius² × height
    double volume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }
}

public class q14 {
    public static void main(String[] args) {
        q14_VolumeCalculator vc = new q14_VolumeCalculator();

        System.out.println("Volume of Cube: " + vc.volume(5));                   // Cube: side = 5
        System.out.println("Volume of Rectangular Box: " + vc.volume(4, 3, 6));  // Box: 4 × 3 × 6
        System.out.println("Volume of Cylinder: " + vc.volume(3, 7));            // Cylinder: radius = 3, height = 7
    }
}
