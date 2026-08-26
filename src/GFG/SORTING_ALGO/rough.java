package GFG.SORTING_ALGO;

public class rough {
    static void main(String[] args) {
        int[] arr={5,-2,2,6,5,4,7,9,1};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minIdx=-1;
            int min=Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    minIdx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIdx];
            arr[minIdx]=temp;
        }


    }
}
