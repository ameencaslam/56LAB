import java.util.Scanner;

// User-defined exception class
class MinBalExp extends Exception {
    public MinBalExp(String message) {
        super(message);
    }
}

// Account class
class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + balance);
    }

    // Method to withdraw money
    public void withdraw(double amount) throws MinBalExp {
        if (amount > balance) {
            throw new MinBalExp("Insufficient balance! Cannot withdraw " + amount);
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
        System.out.println("Remaining Balance: " + balance);
    }
}

public class q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account(5000);  // Initial balance

        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        acc.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        
        try {
            acc.withdraw(withdrawAmount);
        } catch (MinBalExp e) {
            System.out.println( e.getMessage());
        }

        sc.close();
    }
}
