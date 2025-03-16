
import java.util.Scanner;

class q9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Word : ");
        String word = sc.nextLine();
        String rev = new StringBuilder(word).reverse().toString();
        System.out.println("Reverse : " + rev);
        System.out.println((word.equals(rev) ? "IS PALINDROME" : "IS NOT PALINDROME"));
    }
}