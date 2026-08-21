package ROUGH_WORK;
import java.util.Scanner;
public class sumofallodd {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=input.nextInt();
        int i=1;
        int sum=0;
        while(i<=num){
            sum+=i;
            i+=2;
        }
        System.out.println("The sum of all odd numbers upto N: " + sum);
    }
}
