package GFG.BINARY_SEARCH_01;

public class LC_search_sorted_matrix {
    boolean isFound(int[][] arr,int tar){
        int rows= arr.length, columns= arr[0].length;
        int lo=0; int hi=rows*columns - 1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            int midRow= mid/columns;  /*do it on rough pta lag jayega*/
            int midColumn= mid%columns;
            if(arr[midRow][midColumn]==tar) return true;
            else if(arr[midRow][midColumn]<tar) lo= mid+1;
            else if(arr[midRow][midColumn]>tar) hi=mid-1;

        }
        return false;
    }
}
