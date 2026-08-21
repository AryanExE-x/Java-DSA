package GFG.BINARY_SEARCH_01;

public class LC_binary_search_algo {
    static int binarysearch(int[] arr,int target){
        int n=arr.length;
        int lo=0; int hi=n-1;
        int mid;
        while(lo<=hi){
            mid=(lo+hi)/2;
            if(arr[mid]>target) hi=mid-1;
            else if(arr[mid]<target) lo=mid+1;
            else if(arr[mid]==target)return mid;

        }
        return -1;

    }
}
