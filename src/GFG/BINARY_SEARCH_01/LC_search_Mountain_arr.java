package GFG.BINARY_SEARCH_01;

public class LC_search_Mountain_arr {  /*peak element in mountain array*/
    public static int peakElement(int[] arr){
        int n = arr.length;
//        int lo=0; int hi=n-1;   /*exception error aajayegi*/
        int lo=1; int hi=n-2;     /*to avoid index out of bound error and 1st n last el peak nhi ho skta*/
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) lo=mid+1;  //increasing part.
            else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]) hi=mid-1;  //decreasing part.
        }
        return -1;

    }
}
