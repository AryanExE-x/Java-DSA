package xCHALLENGES_01;

import java.util.Scanner;

public class AbsoluteTernary {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num=input.nextInt();
        int abs=absolute(num);
        System.out.println("The absolute value of the number entered is: " + abs);
        String oddOrEven=oddeven(num);
        System.out.println(oddOrEven);


    }

    public static int absolute(int num){
        return (num < 0) ? (-num) : (num) ;
    }

    public static String oddeven(int num){
        return (num%2==0) ? ("The number is even") : ("The number is Odd");
    }

}
