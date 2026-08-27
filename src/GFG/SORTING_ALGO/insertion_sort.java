package GFG.SORTING_ALGO;

//Take the current element and insert it into the correct position by shifting bigger elements
//We're not swapping.
//We're shifting.
public class insertion_sort {
    static void sort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;

        } //*Insertion Sort = Pick → Shift → Insert
    }
}
//*Complexity
//*Case	Time
//*Best	O(n)
//*Average	O(n²)
//*Worst	O(n²)
//*Space	O(1)