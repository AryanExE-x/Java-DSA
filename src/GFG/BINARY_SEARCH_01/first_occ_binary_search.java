package GFG.BINARY_SEARCH_01;

public class first_occ_binary_search {
    public static int firstOc(int[] arr, int target){
        int n = arr.length;
        int lo=0; int hi=n-1; int mid; int index=-1;
        while(lo<=hi){
            mid=(lo+hi)/2;
            if(arr[mid]<target) lo=mid+1;
            else if(arr[mid]>target) hi=mid-1;
            else if(arr[mid]==target){
                index=mid;
                hi = mid-1;  /*for first occ*/
            }
        }
        return index;
    }
}
