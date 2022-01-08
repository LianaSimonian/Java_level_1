//12

import java.util.Scanner;

public class Main {
    static void sumEndAverage(int n) {
        int s = 0;
        double avg = 0;
        for (int i = 0; i < n; i++) {
            Scanner in = new Scanner(System.in);
            System.out.println("Input the " + i + "th  numbers : ");
            int num = in.nextInt();
            s += num;
        }
        avg = s / n;
        System.out.println("The sum of " + n + " integers  is : " + s + "\nThe Average is : " + avg);

    }

    public static void main(String[] args) {
        sumEndAverage(5);

    }

}
