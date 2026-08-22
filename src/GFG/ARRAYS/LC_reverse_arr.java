
public class LC_reverse_arr {
    static void main(String[] args) {
        int[] arr= {1,2,3,45,6,7};

        //two pointer method

        int size=arr.length;
        int i=0;
        int j=(size-1);
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int el=0;el< arr.length;el++){
            System.out.print(arr[el] + " ");
        }
        System.out.println();

        //method 2- using for loop  and swap arr[i] and arr[n-i-1]

        for(int k=0;k<size/2;k++){
            int temporary=arr[k];
            arr[k]=arr[size-1-k];
            arr[size-1-k]=temporary;
        }
        for(int z=0;z<size;z++){
            System.out.print(arr[z] + " ");
        }


    }
}
