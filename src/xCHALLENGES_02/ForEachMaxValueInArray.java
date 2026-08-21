package xCHALLENGES_02;
import java.util.Scanner;
public class ForEachMaxValueInArray {
    static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your size: ");
    int size=input.nextInt();
    int[] arr = new int[size];

    /*we can use array utility also*/
    for(int i=0;i<size;i++){
        System.out.printf("Enter element number %d : ",i+1);
        arr[i]=input.nextInt();
    }
        
        System.out.print("[ ");

    for(int output: arr){
        System.out.print(output + " ");
    }
        System.out.println("]");

    int max=Integer.MIN_VALUE;
    for(int num: arr){
        if(num>max){
            max=num;
        }
    }
        System.out.println("The maximum value in the array is: " + max);

    }
}
