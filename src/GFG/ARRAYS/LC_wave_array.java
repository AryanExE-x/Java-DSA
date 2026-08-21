package GFG.ARRAYS;
//sorted array given. arr[1]>=arr[2]<=arr[3]>=arr[4]<=arr[5]...and so on
public class LC_wave_array {
    static void wavy(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i=i+2){
            int j=i+1;
            if(i==n-1) break;  //this is for odd size. even mein prob nhi hogi. warna loop hi i<n-1 tak leke jao
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
