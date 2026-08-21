package xCHALLENGES_02;
import xCHALLENGES_01.ArrayUtility;

import java.util.Scanner;
public class ForEachOccurencesArray {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr= ArrayUtility.inputArray();
        System.out.print("Number to search in the array: ");
        int num=input.nextInt();

        int count=0;
        for(int n : arr){
            if(n==num){
                count++;
            }
        }
        System.out.printf("the number %d was found %d times in the array",num,count);
    }


}
