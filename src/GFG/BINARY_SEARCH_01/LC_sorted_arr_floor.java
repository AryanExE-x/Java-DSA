package GFG.BINARY_SEARCH_01;

public class LC_sorted_arr_floor {
    static int floor(int[] arr, int tar){
        int n=arr.length;
        int lo=0; int hi=n-1;
        int index=-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>tar) hi=mid-1;
            else if(arr[mid]<=tar){  /*since we need floor. nearest number to target and last occ of num<tar*/
                index=mid;
                lo=mid+1;
            }
        }
        return index;
    }
}
