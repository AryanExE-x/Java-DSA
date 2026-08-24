package LAB_ASSIGNMENTS.LabAssignment2;
import java.util.Scanner;
public class Program1_2510110122 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the x coordinate of the point p: ");
        int p1 = input.nextInt();
        System.out.print("Enter the y coordinate of the point p: ");
        int p2 = input.nextInt();
        if(p1==0 && p2==0){
            System.out.println("The point p lies on origin");
        }
        else if(p1!=0 && p2==0){
            System.out.println("The point p lies on on the x axis");
        }
        else if(p1==0 && p2!=0){
            System.out.println("The point p lies on on the y axis");
        }
        else if(p2==0 && p1!=0){
            System.out.println("The point p lies on on the x axis");
        }
        else if(p1>0 && p2>0){
            System.out.println("The point p lies on the first quadrant");
        }
        else if(p1<0 && p2>0){
            System.out.println("The point p lies on the second quadrant");
        }
        else if(p1<0 &&p2<0){
            System.out.println("The point p lies on the third quadrant");
        }
        else{
            System.out.println("The point p lies on the fourth quadrant");
        }
    }
}
