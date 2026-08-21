package GFG.ARRAYS;

import java.util.Scanner;

public class LC_two_sum {
    static void main(String[] args) {
        Scanner input = new Scanner(((((System.in)))));
        System.out.println("Enter num of elements in the array");
        int size = input.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter element number " + (i+1) + " : ");
            arr[i]=input.nextInt();
        }
        System.out.print("Enter target number: ");
        int target=input.nextInt();

        boolean found=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    found=true;
                    System.out.printf("Numbers at indices %d and %d sum up to the target- %d",i,j,target);
                    System.out.println();
                }
            }
        }

    }
}
