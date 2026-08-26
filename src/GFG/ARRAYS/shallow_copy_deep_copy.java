package GFG.ARRAYS;

import java.util.Arrays;

public class shallow_copy_deep_copy {
    static void main(String[] args) {
        int a = 4;  /*? 4 bytes*/
        int[] arr={10,20,30}; /*? 12 bytes*/
        int[] shallow = arr;            /*shallow copy of arr*/
        shallow[0]=100;
        System.out.println(arr[0]);
        System.out.println(shallow[0]);
        System.out.println("SHALLOW\nDEEP");
        int[] arr2={1,2,3}; /*? 12 bytes  4 x 3 = 12 */
        int[] deep = Arrays.copyOf(arr2,3);
        deep[0]=1000;                /*deep copy of arr2*/
        System.out.println(arr2[0]);
        System.out.println(deep[0]);
        System.out.println("\n\n");

        //or for deep copy

        int[] brr= new int[arr2.length];
        for(int i=0;i<arr2.length;i++){
            brr[i]=arr[i];
        }
        for (int i = 0; i <brr.length ; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
