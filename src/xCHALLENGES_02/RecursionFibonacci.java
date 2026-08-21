package xCHALLENGES_02;
import java.util.Scanner;
public class RecursionFibonacci {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number upto which you want fibonacci series: ");
        int num=input.nextInt();
        for(int i=1;i<=num;i++){
            System.out.print(fibonacciVal(i) + " ");
        }
    }

    //0 1 1 2 3 5 8 13 21 34 55
    public static int fibonacciVal(int position){
        if(position <= 1){
            return 0;
        }

        if(position == 2 || position == 3){
            return 1;
        }
        else{
            return fibonacciVal(position -1)+fibonacciVal(position -2);

        }
    }
}
