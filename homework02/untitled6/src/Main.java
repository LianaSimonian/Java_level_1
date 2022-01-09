import java.util.Scanner;

public class Main {
    static void checkEqualityFloatNum() {
        Scanner in = new Scanner(System.in);

        System.out.print("Input floating-point number ");
        double x = in.nextDouble();
        System.out.print("Input floating-point  number");
        double y = in.nextDouble();
        if (Math.abs(x - y) < 0.001) {
            System.out.println("They are the same up to three decimal places");
        } else {
            System.out.println("They are different");
        }
    }


    public static void main(String[] args) {

        checkEqualityFloatNum();
    }
}
