//8

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character : ");
        String str = sc.next();
        if (str.length() > 1) {
            System.out.println("Input error:string,Not an character");
            return;
        }

        char ch = str.charAt(0);//how can i input char

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is  Vowel");
        } else {
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                System.out.println(ch + " is Consonant");
            } else {
                System.out.println("Input error:Not an alphabet");

            }
        }
    }
}

