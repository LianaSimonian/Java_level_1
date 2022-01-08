//15
public class Main {
    static void oddNumberEndSum(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(2 * i - 1);
            sum += 2 * i - 1;
        }
        System.out.println("The Sum of odd Natural Number upto " + n + " terms is: " + sum);
    }
//another task
    static void functionOddNum(int n) {
        //the sum of odd numbers up to 9
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
            sum += i;

        }
        System.out.println("The Sum of odd Natural Number up to " + n + " is :" + sum);
    }

    public static void main(String[] args) {
        oddNumberEndSum(5);
        functionOddNum(5);

    }
}
