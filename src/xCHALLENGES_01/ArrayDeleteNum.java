package xCHALLENGES_01;

import java.util.Scanner;

public class ArrayDeleteNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numArr=ArrayUtility.inputArray();

        System.out.println("Enter a number to delete from the array: ");
        int num= input.nextInt();

        int[] newArr=delNum(numArr,num);

        System.out.println("Here is your new array:-");
        ArrayUtility.displayArr(newArr);

    }

    public static int[] delNum(int[] numArr,int numToDel){
        int occ=ArrayNoOfOccurrences.noOfOccurrences(numArr,numToDel);
        if(occ==0) return numArr;    /*for optimization. low memory usage*/
        int newSize=numArr.length-occ;
        int[] newArr = new int[newSize];

        int i=0, j=0;
        while(i<numArr.length){
            if(numArr[i]!=numToDel){
                newArr[j]=numArr[i];
                j++;
            }

            i++;
        }
        return newArr;
    }

}
