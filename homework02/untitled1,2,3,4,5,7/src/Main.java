import java.lang.Math;
import java.util.Scanner;

public class Main {
    //1
    static void isNumWeirdOrNot(int num) {
        System.out.println("check " + num + " Weird or not ");
        if ((num & 1) == 1) {
            //The odd number can also be checked by (num%2==1) statement, but bitwise operators are faster
            System.out.println("Weird");
        } else {
            if (num >= 2 && num <= 5) {
                System.out.println("Not Weird1");
            } else {
                if (num >= 6 && num <= 20) {
                    System.out.println("Weird1");
                } else {
                    System.out.println("Not Weird2");
                }
            }
        }

    }

    //2
    static void printMultiplesWithoutAddArg(long N) {
        System.out.println("print 10 multiples of " + N);
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + "*" + i + "=" + N * i);
        }

    }

    //defalut values in java function ?
    //it will be convenient to use mult as function  value by default
    static void printMultiplesWithAddArg(long N, long mult) {
        System.out.println("print " + mult + " multiples of " + N);
        for (int i = 1; i <= mult; i++) {
            System.out.println(N + "*" + i + "=" + N * i);
        }
    }

    //3
    static void solveQuadraticEquation(double a, double b, double c) {

        if (a == 0.0) {
            if (b == 0.0) {
                if (c == 0.0) {
                    System.out.println("It is not quadratic equestion " + " a=" + a + " b=" + b + " c=" + c + " :the equestion has an infinite number of solutions");
                } else {
                    System.out.println("It is not quadratic equestion " + " a=" + a + " b=" + b + " c=" + c + " :the equation has no solution");
                }
            } else {
                if (c == 0.0) {
                    System.out.println("It is not quadratic equestion " + " a=" + a + " b=" + b + " c=" + c + " :the equestion has solution: root = " + 0);
                } else {
                    System.out.println("It is not quadratic equestion " + " a=" + a + " b=" + b + " c=" + c + " :the equestion has solution: root=-c/b = " + (-c / b));
                }

            }

        } else {
            System.out.println("solve the equestion:" + a + "x^2+(" + b + ")x " + "+(" + c + ")");
            double discriminant = b * b - 4.0 * a * c;
            if (discriminant > 0.0) {
                // equestion has two distinct roots,both of which are real numbers
                double r1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
                double r2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);
                System.out.printf("root1 =%.2f", r1);
                System.out.printf(" root2 =%.2f\n", r2);
            } else {//equestion has one real root
                if (discriminant == 0.0) {
                    double r = -b / (2.0 * a);
                    System.out.printf("root =%.3f\n", r);
                } else {// roots are complex number
                    double real = -b / (2.0 * a);
                    double imaginary = Math.sqrt(-discriminant) / (2.0 * a);
                    System.out.printf("root1 = %.2f + %.3fi ", real, imaginary);
                    System.out.printf("root2 = %.2f - %.3fi\n", real, imaginary);


                }
            }
        }
    }

    //4
    static void checkFloatPointNum() {
        //get input from user
        Scanner in = new Scanner(System.in);
        System.out.println("Input double value:");
        double num = in.nextDouble();

        if (num > 0) {
            if (num < 1) {
                System.out.println("Positive small number:" + num);
            } else {
                if (num > 1000000) {
                    System.out.println("Positive large number:" + num);
                } else {
                    System.out.println("Positive  number:" + num);
                }
            }
        } else {
            if (num < 0) {
                if (Math.abs(num) < 1) {
                    System.out.println("Negative small number:" + num);
                } else {
                    if (Math.abs(num) > 1000000) {
                        System.out.println("Negative large number:" + num);
                    } else {
                        System.out.println("Negative  number:" + num);
                    }
                }
            } else {
                System.out.println("Zero:" + num);
            }

        }
    }

    //5
    // algorithm 1
    static String getWeekday() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input integer :");
        int num = in.nextInt() % 7 + 1;
        String str = " ";
        switch (num) {
            case 1:
                str = "Monday";
                break;
            case 2:
                str = "Tuesday";
                break;
            case 3:
                str = "Wednesday";
                break;
            case 4:
                str = "Thursday";
                break;
            case 5:
                str = "Friday";
                break;
            case 6:
                str = "Saturday";
                break;
            case 7:
                str = "Sunday";
                break;
        }
        System.out.println(num);
        return str;

    }

    // algorithm 2
    static String getWeekday1() {
        String[] arr = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner in = new Scanner(System.in);
        System.out.println("Input integer :");
        int index = in.nextInt() % 7;
        System.out.println(index);

        return arr[index];
    }

    //7
    static void numberDaysInMonth(int m, int y) {

        String str = " ";
        int day = 0;
        if (m <= 12 && m >= 1) {
            if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
                day = 31;
            } else {
                if (m == 4 || m == 6 || m == 9 || m == 11) {
                    day = 30;
                } else {
                    if ((m % 400 == 0) || (m % 4 == 0 && (m % 100 != 0))) {
                        day = 29;
                    } else {
                        day = 28;
                    }
                }
            }
            System.out.println(nameOfMonth(m) + " " + y + " has " + day + " days");

        } else {
            System.out.println("Input error: month number is not  in the calender");


        }
    }

    //Auxiliary function
    static String nameOfMonth(int n) {

        switch (n) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return " ";
        }
    }

    public static void main(String[] args) {

        isNumWeirdOrNot(3);
        isNumWeirdOrNot(4);
        isNumWeirdOrNot(10);
        isNumWeirdOrNot(22);

        printMultiplesWithoutAddArg(2);
        printMultiplesWithAddArg(2, 11);

        solveQuadraticEquation(0, 0, 0);
        solveQuadraticEquation(0, 0, 2);
        solveQuadraticEquation(0, 2, 0);
        solveQuadraticEquation(0, 1, 3);
        solveQuadraticEquation(1, -6, -16);
        solveQuadraticEquation(1, -4, 4);
        solveQuadraticEquation(2, 3, 6);

        //testing
        //System.out.printf("%.2f", 1.025444);
        //double x =Math.sqrt(-5);
        //System.out.println(x);

        checkFloatPointNum();
        checkFloatPointNum();
        checkFloatPointNum();
        checkFloatPointNum();


        System.out.println("weekday: " + getWeekday());
        System.out.println("weekday: " + getWeekday1());

        numberDaysInMonth(2, 2016);
        numberDaysInMonth(24, 2005);


    }
}