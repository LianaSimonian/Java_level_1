//14
public class Main {
    static void multiplicationTable(int num) {
        System.out.println("multiplication table of number: " + num);
        for (int i = 0; i < num; i++) {
            System.out.println(num + " x " + i + " = " + i*num);
        }
    }

    public static void main(String[] args) {
      multiplicationTable(5);
    }
}
