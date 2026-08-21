package ROUGH_WORK;
import java.util.Scanner;
public class format_specifying {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float length=input.nextFloat();
        float breadth=input.nextFloat();
        double perimeter=2*(length+breadth);
        int newperimeter=(int)perimeter;
        System.out.format("The perimeter is : %d" , newperimeter);

        //System.out.printf(); or System.out.format for all format specifiers
    }
}
