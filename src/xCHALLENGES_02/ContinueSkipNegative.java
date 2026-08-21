package xCHALLENGES_02;
import java.util.Scanner;
public class ContinueSkipNegative {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int sum=0;
        while(true){
            System.out.print("Enter the number: ");
            num=input.nextInt();
            if(num<0){
                continue;
            }
            sum+=num;
            System.out.println("The sum of positive numbers is: "+ sum);
        }
    }
}
