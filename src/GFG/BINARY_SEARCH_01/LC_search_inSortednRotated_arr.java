package GFG.BINARY_SEARCH_01;

public class LC_search_inSortednRotated_arr {
    public static int search(int[] arr, int tar){
        int n=arr.length;
        int lo=0; int hi=n-1;
        while(lo<=hi){
            int mid = lo +(hi-lo)/2;
            if(arr[mid]==tar) return mid;
            else if(arr[lo]<=arr[mid]){  /*if low to mid is sorted*/
                if(arr[lo]<=tar && tar<arr[mid]) hi=mid-1;
                else lo=mid+1;

            }
            else if(arr[mid]<=arr[hi]){  /*if mid to high is sorted*/
                if(arr[mid]<tar && tar<=arr[hi]) lo=mid+1;
                else hi=mid-1;
            }
        }
        return -1;
    }

}
