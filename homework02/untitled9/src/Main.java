//9

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    static void checkLeapYear() {

        Scanner in = new Scanner(System.in);
        System.out.println("Input the year: ");
        try {
            int year = in.nextInt();

            if (year <= 0) {
                System.out.println("Input error :negative value for year");
                return;
            }
            if ((year % 400) == 0 || ((year % 4) == 0 && (year % 100) != 0)) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is not a Leap Year");
            }
        } catch (InputMismatchException e) {
            System.out.print("That’s not  an integer. Try again: ");
        }
    }

    public static void main(String[] args) {
        checkLeapYear();
    }
}
