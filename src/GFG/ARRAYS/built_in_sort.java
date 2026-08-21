package GFG.ARRAYS;
import java.util.Arrays;
public class built_in_sort {
    static void main(String[] args) {
        int[] arr={400,5,45,23,31,76,87,34};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
