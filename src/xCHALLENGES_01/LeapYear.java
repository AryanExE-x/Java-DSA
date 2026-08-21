//Leap year check

package xCHALLENGES_01;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.print("Enter your year: ");
        int year = input.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) System.out.println("The year is a leap year");
        /*Year should be divisible by 4 but not 100 unless its 400*/

        else System.out.println("The year is not a leap year");

    }
}
