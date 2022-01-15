//task6 version1
//iterative solution
import java.util.Scanner;

public class SimpleProgram {
    public static int fibonacci(int n){
        int f0=0;
        int f1=1;
        int c=(n==0)?f0:(n==1)?f1:0;

        for(int i=2;i<=n;i++){
            c=f0+f1;
            f0=f1;
            f1=c;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input integer number:");
        int  n = sc.nextInt();
        System.out.println(n+"-th number of Fibonacci is equal :" + fibonacci(n));

    }
}
