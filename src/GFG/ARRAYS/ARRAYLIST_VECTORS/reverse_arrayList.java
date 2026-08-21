package GFG.ARRAYS.ARRAYLIST_VECTORS;
import java.util.ArrayList;
public class reverse_arrayList {
    static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList< >();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        int n = arr.size();
        int i=0;
        int j=n-1;
        while(i<j){
            int temp=arr.get(i);
            arr.set(i,arr.get(j));   //index i pe jth wali element daalni hai.
            arr.set(j,temp);
            i++;
            j--;
        }
        System.out.println(arr);
        ArrayList<Character> ch = new ArrayList< >();
        ArrayList<Double> f = new ArrayList< >();
        ArrayList<String> str = new ArrayList< >();


    }
}
