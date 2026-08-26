package GFG.SORTING_ALGO;

import xCHALLENGES_01.ArrayUtility;
//*Find the minimum element and put it at the beginning of the unsorted part.
/*select smallest element in the array in each pass*/
public class selection_sort {
    static void main(String[] args) {

        int[] arr = {5,43,21,1,7,79,3};
        ArrayUtility.displayArr(arr);
        int n= arr.length;

        for(int i=0;i<n-1;i++){
//Once those n-1 positions are correct, the last element automatically has to be correct.

            int min=Integer.MAX_VALUE;
            int minIndex=-1;

            for(int j=i;j<n;j++){
//j=i and not j=0 Because everything before i has already been sorted.
                if(arr[j]<min){
                    min=arr[j];
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }

        ArrayUtility.displayArr(arr);

    }

}
