//task2 version2

import java.util.Scanner;

public class SimpleProgram {
    public static void main(String[] args) {
        int c = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println("input integer num:");
            Scanner scanner = new Scanner(System.in);//for effective object(scanner and num) can create out of block
            int num = scanner.nextInt();//Scanner sc; int num;for()
            if (num == 10) {
                c++;
                //System.out.println("yes");
            }
        }
        if (c != 0)
            System.out.println("yes:the number of such terms is equal " + c);
        else System.out.println("No");
    }
}