package GFG.BINARY_SEARCH_01;

public class singles_among_doubles_sortedArr {
    int findSingle(int[] arr){
        int n=arr.length;
        if(n==1) return arr[0];  /*js in case arr size is 1 return the first element*/
        if(arr[0]!=arr[1]) return arr[0];   /*extreme elements of the array first n last checkmark*/
        if(arr[n-1]!=arr[n-2]) return arr[n-1];

        int lo=0, hi=n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) return arr[mid];

            int firstOcc=0, secondOcc=0;
            if(arr[mid-1]==arr[mid]){
                firstOcc=arr[mid-1];
                secondOcc=arr[mid];
            }
            else{  /*in case arr[mid]==arr[mid+1] */
                firstOcc=arr[mid];
                secondOcc=arr[mid+1];
            }

            int leftCount= firstOcc-lo;  //since we dont need to count firstoccurence;
            int rightCount= hi-secondOcc;
            if(leftCount%2 ==0) lo=secondOcc+1;
            else if(rightCount%2==0) hi=firstOcc-1;
        }
        return -1;
    }
}
