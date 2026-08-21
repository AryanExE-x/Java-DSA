package GFG.SORTING_ALGO;

public class bubble_sort_reverse {
    static void main(String[] args) {
        int[] arr={5,3,2,8,34,1,9,-3,6};
        int n=arr.length;
        for(int passes=0;passes<n-1;passes++){
            int swaps=0;  /*making a flag for optimization*/
            for(int i=0;i<n-1-passes;i++){
                if(arr[i]<arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    swaps++;  /*to ensure arr is not sorted, time complexity waali baat*/
                }
            }
            if(swaps==0) break;  //matlab array already sorted hai in descending order
        }
        for(int el : arr){
            System.out.print(el + " ");
        }
        System.out.println();
    }
}
