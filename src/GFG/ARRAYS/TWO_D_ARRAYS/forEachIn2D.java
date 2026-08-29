package GFG.ARRAYS.TWO_D_ARRAYS;

import java.util.Scanner;

public class forEachIn2D {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,4,1,2}};
        for(int[] a : arr){
            for(int el : a){
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}
