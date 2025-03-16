import java.util.Arrays;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements (10 or more): ");
        int n = sc.nextInt();
        
        if (n < 10) {
            System.out.println("Please enter at least 10 numbers.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        sc.close();

        // Sort the array
        Arrays.sort(arr);

        // Smallest element is the first element
        int smallest = arr[0];
        // Largest element is the last element
        int largest = arr[n - 1];
        // Second largest element is the second last element
        int secondLargest = arr[n - 2];

        System.out.println("Smallest Element: " + smallest);
        System.out.println("Largest Element: " + largest);
        System.out.println("Second Largest Element: " + secondLargest);
    }
}
