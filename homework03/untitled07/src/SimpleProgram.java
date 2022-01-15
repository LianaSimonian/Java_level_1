//task7
import java.util.Scanner;

public class SimpleProgram {
    public static int sumOfFibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int sum = 1;
        int c = 0;
        if (n <= 1) return n;

        for (int i = 2; i <= n; i++) {
            c = f0 + f1;
            f0 = f1;
            f1 = c;
            sum += c;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input integer number:");
        int n = sc.nextInt();
        System.out.println("the sum of all numbers of Fibonacci until "+ n + " is equal to: " +  sumOfFibonacci(n));

    }
}
