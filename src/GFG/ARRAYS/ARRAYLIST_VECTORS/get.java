package GFG.ARRAYS.ARRAYLIST_VECTORS;
import java.util.ArrayList;
import java.util.Collections;
public class get {
    static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList< >();
        arr.add(7);
        arr.add(18);
        arr.add(45);
        arr.add(11);
        System.out.println(arr.get(0));
        arr.set(0,177); //arr[0]=177;
        System.out.println(arr.get(0)+ " " + arr.get(1));
        System.out.println(arr);  //not traversing the array by ourselves

        int n = arr.size();   //arr.length arraylist ki size();
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
        System.out.println();

        arr.add(1,99);  //add(index, num);
        arr.remove(1); //index daalo.
        arr.remove((arr.size())-1); //last element remove.
        Collections.reverse(arr);
        System.out.print(arr);
    }
}
