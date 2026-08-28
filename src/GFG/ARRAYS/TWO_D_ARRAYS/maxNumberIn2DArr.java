package GFG.ARRAYS.TWO_D_ARRAYS;

import java.util.Scanner;

public class maxNumberIn2DArr {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,4,1,2}};
        System.out.println(maxNumber(arr));

    }
    public static int maxNumber(int[][] arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
    public static int rowWithMaximumSum(int[][] arr){
        return -1;
    }
}
