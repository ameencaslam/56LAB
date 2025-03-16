import java.util.Scanner;

class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        // Remove vowels using replaceAll()
        String result = input.replaceAll("[AEIOUaeiou]", "");
        
        System.out.println("String after removing vowels: " + result);
    }
}
