package GFG.SORTING_ALGO;
import java.util.Arrays;
public class LC_two_sum_pair {
    boolean twoSum(int[] arr, int target){
        Arrays.sort(arr); // time = nlogn ,   space = 1.
        int n=arr.length;
        int i=0; int j=n-1;  //*TWO POINTER METHOD
        while(i<j){  //time = n.
            if(arr[i]+arr[j]==target) return true;
            else if(arr[i]+arr[j]>target) j--;
            else if(arr[i]+arr[j]<target) i++;
        }
        return false;
    }

}
