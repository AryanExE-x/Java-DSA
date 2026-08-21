package GFG.LOOPS;
import java.util.Scanner;
public class a_raised_to_b {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a= input.nextInt();
        int b= input.nextInt();
        int pow=1;
        for(int i=1;i<=b;i++){
            pow*=a;
        }
        System.out.println(a + " raised to " + b + " is : " + pow);
    }

}
