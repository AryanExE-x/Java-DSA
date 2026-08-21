package GFG.SORTING_ALGO;

public class bubble_sort_betterV {
    public static void print(int[] arr){
        for(int el : arr){
            System.out.print(el + " ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        int[] arr={5,-2,2,6,5,4,7,9,1};
        int n=arr.length;
        print(arr);
        for(int passes=0;passes<n-1;passes++){  //agar 100 elements toh 99 passes hoga na

            boolean isSorted=true;  /*initially assume arr sorted hai*/
            for(int s=0;s<n-1;s++){  /*check karo sorted nhi hai na and flag iSorted as FALSE*/
                if(arr[s]>arr[s+1]){
                    isSorted=false;
                    break;  //!this will only break its parent loop, not the nested loops
                }
            } //? this code is for better optimization
            if(isSorted) break;  /*agar check karne pe sorted mile then break the whole loop*/

            /*this code vv will only run agar arr sorted nhi. i.e=> isSorted=false*/
            for(int i=0;i<n-1-passes;i++){  //in each pass check and swap in order to sort..(n-1->to avoid array out of bound exception err)
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }

        System.out.println();
        print(arr);

    }
}

