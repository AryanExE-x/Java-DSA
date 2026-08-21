package ROUGH_WORK;
import java.util.Scanner;
public class pracmethods {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("-------");
        System.out.print("Enter ur num: ");
        int num=input.nextInt();
        star(num);
        System.out.println("-------------");
        System.out.println("Enter numbers to be evaluated: ");
        int n=input.nextInt();
        int nums[]=new int[n];
        int i=0;
        while (i<n){
        System.out.printf("Enter number %d ",i+1);
        nums[i]=readnum();
        i++;
        }
    }

    public static void star(int num){
        int rows=0;
        while(rows<num){
            System.out.print("*");
            int i=0;
            while(i<rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }

    public static int sum(int int1,int int2){
        return int1+int2;
    }

    public static int readnum(){
        Scanner inp=new Scanner(System.in);
        return inp.nextInt();
    }

}
