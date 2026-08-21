package GFG.BINARY_SEARCH_01;
/*!HARD QUESTION LEETCODE*/
public class LC_kth_missing_pos_sortedARR { /*kth missing pos number in sorted arr*/
    public static int kthmissing(int[] arr, int k){
            int lo =0, hi=arr.length-1;
            while (lo<=hi){
                int mid = (lo+hi)/2;
                int correctNum=mid+1;
                int missingNumbers= arr[mid]-correctNum;
                if(missingNumbers>=k){  /*go left then*/
                    hi=mid-1;
                }
                else lo=mid+1;
            }
            return lo+k;  /*or return hi+1+k*/
    }

}
