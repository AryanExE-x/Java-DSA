package xCHALLENGES_01;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your number: ");
    int num=input.nextInt();
    multiplicationT(num);

    }

    public static void multiplicationT(int num){
        int i=1;
        while(i<=10){
            System.out.println(num + " x " + i + " = " + (num*i));
            i++;
        }
    }
}
