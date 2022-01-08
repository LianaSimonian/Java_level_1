//10
public class Main {
    static void displayFirst10Numbers() {
        System.out.println("display the first 10 natural numbers");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    static void displayFirst10Numbers1() {
        System.out.println("display the first 10 natural numbers");
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

    }

    public static void main(String[] args) {
        displayFirst10Numbers();
        displayFirst10Numbers1();
        System.out.println("1" + " 2" + " 3" + " 4" + " 5" + " 6" + " 7" + " 8" + " 9" + " 10");
    }

}
