package xCHALLENGES_01;

import java.util.Scanner;

public class LowestCommonMultiple {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=input.nextInt();
        System.out.print("Enter second number: ");
        int b=input.nextInt();
        int res=lcm(a,b);
        System.out.println("The LCM of the two numbers is: " + res);


    }

    public static int lcm(int first,int second){
        int i=1;
        while (i <= second) {
            int factor = first * i;
            if(factor % second ==0){
                return factor;
            }
            i++;
        }
        return 0;  //unreachable
    }
}
