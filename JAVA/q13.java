class q13_Counter {
    static int count = 0;  // Static variable to count objects

    // Constructor increments count when an object is created
    q13_Counter() {
        count++;
    }

    // Static method to display count
    static void displayCount() {
        System.out.println("Total Objects Created: " + count);
    }
}

public class q13 {
    public static void main(String[] args) {
        q13_Counter obj1 = new q13_Counter();
        q13_Counter obj2 = new q13_Counter();
        q13_Counter obj3 = new q13_Counter();

        q13_Counter.displayCount(); // Display total objects created
    }
}
