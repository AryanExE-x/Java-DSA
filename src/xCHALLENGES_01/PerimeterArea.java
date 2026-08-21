package xCHALLENGES_01;

import java.util.Scanner;

public class PerimeterArea {
    static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        int l= input.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int b= input.nextInt();
        int perimeter= 2*(l+b);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        int area= l*b;
        System.out.println("The area of the rectangle is: " + area);


    }
}
