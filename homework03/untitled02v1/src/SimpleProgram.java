//task2 version1
import java.util.Scanner;
public class SimpleProgram {
    public static void main(String[] args){
       for (int i=0;i<6;i++){
           System.out.println("input integer num:");
           Scanner scanner = new Scanner(System.in);//for effective object(scanner and num) can create out of block
           int num = scanner.nextInt();//Scanner sc; int num;for()
           if(num == 10) {
               System.out.println("yes");
               if(true)
                   return;
           }
       }
        System.out.println("No");
    }
}
