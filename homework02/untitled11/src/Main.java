//11

import java.util.Scanner;

public class Main {
    static void displayEndSumOfNumbers(int N) {
        System.out.println("The first " + N + " natural numbers are : ");
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
            sum += i;
        }

        System.out.println("The Sum of Natural Numbers upto " + N + ": " + sum);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input  integer: ");
        int N = in.nextInt();
        displayEndSumOfNumbers(N);
    }
}
