package GFG.LOOPS;
import java.util.Scanner;
public class sum_of_digits {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num=input.nextInt();
        if (num<0) num=-num;      /*in case of negative numbers*/
        int sum=0;
        int lastDigit=0;

        while(num!=0){
            lastDigit=num%10;
            sum+=lastDigit;
            num=num/10;
        }
        System.out.println("sum of digits: " + sum);
        System.out.println("The significant digit: " + lastDigit);
    }
}
