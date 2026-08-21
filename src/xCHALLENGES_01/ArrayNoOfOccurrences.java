package xCHALLENGES_01;

import java.util.Scanner;

public class ArrayNoOfOccurrences {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to No of Occurrences of an Array");
        int[] numArray = ArrayUtility.inputArray();
        System.out.print("Enter the number to find: ");
        int num= input.nextInt();
        int noOfOccurrences=noOfOccurrences(numArray,num);
        System.out.println("Your number was found " + noOfOccurrences + " times in the array.");
    }

    public static int noOfOccurrences(int[] numArray, int num){
        int i=0;
        int count=0;
        while(i<numArray.length){
            if(numArray[i]==num){
                count++;
            }
            i++;
        }
        return count;
    }

}
