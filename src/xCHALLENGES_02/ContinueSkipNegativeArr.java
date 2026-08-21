package xCHALLENGES_02;
import xCHALLENGES_01.ArrayUtility;

import java.util.Scanner;
public class ContinueSkipNegativeArr {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = ArrayUtility.inputArray();
        int sum = 0;
        for(int num : arr){
            if(num<0) continue;
            sum+=num;
        }
        System.out.println("The sum of positive numbers added to the array is : " + sum);

    }
}
