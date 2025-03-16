import java.util.Scanner;

class q8_Sumrev {
    public int num;
    public int sum;
    public int rev;

    // Constructor to initialize the number
    public q8_Sumrev(int num) {
        this.num = num;
    }

    // Method to find the sum of digits
    public void calc() {
        sum = 0;
        rev = 0;
        int temp = num;
        while (temp > 0) {
            sum += temp % 10;  // Get last digit and add to sum
            rev = (rev * 10) + (temp % 10);  // Shift digits left and add last digit
            temp /= 10;         // Remove last digit
        } 
    }
}    
    
public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Creating object
        q8_Sumrev obj = new q8_Sumrev(num);

        obj.calc();
        
        // Displaying results
        System.out.println("Sum of Digits: " + obj.sum);
        System.out.println("Reverse of number: " + obj.rev);
        
        sc.close();
    }
}
