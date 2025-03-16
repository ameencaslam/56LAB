import java.util.Arrays;

public class q5 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        // Create a new array with combined length
        int[] mergedArray = new int[arr1.length + arr2.length];

        // Copy elements of arr1
        for (int i = 0; i < arr1.length; i++) {
            mergedArray[i] = arr1[i];
        }

        // Copy elements of arr2
        for (int i = 0; i < arr2.length; i++) {
            mergedArray[arr1.length + i] = arr2[i];
        }

        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }
}
