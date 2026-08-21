package GFG.SORTING_ALGO;

public class bubble_sort_OPTIMIZED {
    public static void print(int[] arr){
        for(int el : arr){
            System.out.print(el + " ");
        }
        System.out.println("\n");
    }
    static void main(String[] args) {
        int[] arr={5,-2,2,6,5,4,7,9,1};
        int n=arr.length;
        print(arr);
        for(int passes=0;passes<n-1;passes++){  //agar 100 elements toh 99 passes hoga na
            int swaps=0;  /*works like a flag, we can use boolean also. initially as true-> isSorted wala*/
            for(int i=0;i<n-1-passes;i++){  //in each pass check and swap in order to sort..(n-1->to avoid array out of bound exception err)
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    swaps++;
                }
            }
            if(swaps==0) break;  /*agar swaps 0 hai matlab arr is already sorted*/
        }
        System.out.println();
        print(arr);

    }
}
