package ROUGH_WORK;
import java.util.Scanner;
public class arraysearch {
    static void main(String args[]) {
        int[] arr={3,2,4,5,3,5};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to search");
        int num=input.nextInt();
        int ind=0;
        while(ind<arr.length){
            if(arr[ind]==num){
                System.out.printf("The number %d is at index %d and position %d",num,ind,ind+1);
                System.out.println();
            }
            ind++;
        }
    }
}
