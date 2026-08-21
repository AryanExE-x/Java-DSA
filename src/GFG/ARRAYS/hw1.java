//multiply even index elements by 2 and odd index elements add 10..
package GFG.ARRAYS;
public class hw1 {
    static void main(String[] args) {
        int[] arr = {4,23,1,-23,42,52,6};
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]=2*arr[i];
            }
            else{
                arr[i]=arr[i]+10;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
