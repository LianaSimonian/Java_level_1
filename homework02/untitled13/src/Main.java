//13

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println("Cube of " + i + " is: " + Math.pow(i, 3));

        }
    }
}
