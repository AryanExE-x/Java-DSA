package GFG.SORTING_ALGO;

public class bubble_sort_basic {
    public static void print(int[] arr){
        for(int el : arr){
            System.out.print(el + " ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        int[] arr={5,-2,2,5,4,7,9,1};
        int n=arr.length;
        print(arr);
        //har pass mein ek element uthao swap with adjacent element if its greater than the number in
        //that particular swap and keep doing it till n-1 passes.
        for(int passes=0;passes<n-1;passes++){  //agar 100 elements toh 99 passes hoga na
            for(int i=0;i<n-1-passes;i++){  //in each pass check and swap in order to sort..(n-1->to avoid array out of bound exception err)
                //n-1-passes because largest element in each pass is already pushed at the end
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
