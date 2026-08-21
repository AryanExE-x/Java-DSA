package GFG.LOOPS;
import java.util.Scanner;
public class reverse_of_num {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = input.nextInt();
        int lastDigit=0;
        int rev=0;
        while(num!=0){
            lastDigit=num%10;

            rev*=10;
            rev+=lastDigit;
            num/=10;
        }
        System.out.println("The reverse of the number is :  " + rev);
    }
}
