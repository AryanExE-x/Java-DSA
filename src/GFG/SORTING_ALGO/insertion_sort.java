package GFG.SORTING_ALGO;

//Take the current element and insert it into the correct position by shifting bigger elements
//We're not swapping.
//We're shifting.
public class insertion_sort {
    static void sort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){ //j should be >0 not even 0. warna j-1 will become negative
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }



        } //*Insertion Sort = Pick → Shift → Insert
    }
}
//*Complexity
//*Case	Time
//*Best	O(n)
//*Average	O(n²)
//*Worst	O(n²)
//*Space	O(1)