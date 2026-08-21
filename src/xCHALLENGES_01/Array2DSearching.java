package xCHALLENGES_01;

import java.util.Scanner;

public class Array2DSearching {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] numArr=ArrayUtility.input2DArray();
        System.out.println("Enter the Number to search: ");
        int num=input.nextInt();
        boolean isFound=search(numArr,num);
        if(isFound) System.out.println("Your number was found");
        else System.out.println("your number was not found");
    }

    public static boolean search(int[][] numArr,int num){
        int i=0;
        while(i<numArr.length){  /*loop for rows*/
            int j=0;
            while(j<numArr[i].length){  /*loop for columns*/
                if(numArr[i][j]==num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
