package ROUGH_WORK;
import java.util.Scanner;
public class factorial {
    static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to evaluate its factorial: ");
        int num=input.nextInt();
        long fact=itsfactorial(num);
        System.out.println("Factorial using method is : " + fact);
        System.out.println("--------------W/O METHOD-------------");
        int i=num;
        int res = 1;
        while(i>0){
            res=res*i;
            i--;
        }
        System.out.println("The factorial calculated using while loop: " + res);
    }
    public static long itsfactorial(int num){
        if(num==0){   /*base case*/
            return 1;
        }
        return num*itsfactorial(num-1);  /*recursive call*/
    }
}
