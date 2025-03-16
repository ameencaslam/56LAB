class EvenThread implements Runnable {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

public class q17 {
    public static void main(String[] args) {
        Thread even = new Thread(new EvenThread());
        Thread odd = new Thread(new OddThread());

        even.start();
        odd.start();
    }
}
