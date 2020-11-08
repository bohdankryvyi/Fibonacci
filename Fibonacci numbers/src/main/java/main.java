import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please set count of Fibonacci numbers to calculate: ");
        int n = scanner.nextInt();
        System.out.println("Please set start of the interval: ");
        int k = scanner.nextInt();
        System.out.println("Please set end of the interval: ");
        int l = scanner.nextInt();


        Fibonacci.calculateFibo(k, l, n);
    }
}
