package xCHALLENGES_02;
import xCHALLENGES_01.ArrayUtility;

import java.util.Scanner;
public class ContinueEvenNumbersArr {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr= ArrayUtility.inputArray();
        System.out.print("ALl the even numbers in the array are [ ");
        for(int num : arr){  /*using for each for traversal*/
            if(num%2!=0){
                continue;
            }
            System.out.print(num + " ");
        }
        System.out.println("]");
    }
}
