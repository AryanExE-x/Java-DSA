package GFG.SORTING_ALGO;

public class LC_check_arr_isSorted {
    public static boolean isSorted(int[] arr){
        int size = arr.length;
        for(int i=0;i<size-1;i++){
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }
}
