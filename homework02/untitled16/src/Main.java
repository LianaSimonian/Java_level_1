//16
public class Main {
    static void patternRightAngleTriangle(int n) {
        System.out.println("pattern of right angle triangle");
        System.out.println("Input number of rows :" + n);
        for (int i = 1; i <= n; i++) {
            String s = " ";
            for (int j = 1; j <= i; j++) {
                s += j;
            }
            System.out.println(s);
        }

    }

    public static void main(String[] args) {
        patternRightAngleTriangle(10);

    }
}

