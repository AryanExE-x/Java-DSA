package xCHALLENGES_02;
import java.util.Scanner;
public class ContinueEvenNumbers {
    static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        while(true){
            System.out.print("Enter the number: ");
            int num=input.nextInt();
            if(num%2!=0){
                continue;
            }
            System.out.println("The number is " + num + " ");
        }
    }
}
