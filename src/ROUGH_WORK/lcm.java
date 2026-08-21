package ROUGH_WORK;
import java.util.Scanner;
public class lcm {
    static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ur number 1: ");
        int first=input.nextInt();
        System.out.println("Enter ur number 2: ");
        int second=input.nextInt();
        int lcm=returnlcm(first,second);
        System.out.printf("The lcm of %d and %d is %d",first,second,lcm);
    }

    public static int returnlcm(int num1,int num2){
        int i=1;
        while(i<=num2){
            int factor=num1*i;
            if(factor%num2==0){
                return factor;  /*this will exit the infinite loop*/
            }
            i++;
        }
        return 0;  /*unreachable*/
    }
}
