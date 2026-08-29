package GFG.ARRAYS.TWO_D_ARRAYS;

import java.util.ArrayList;

public class ArrayListOfArrayList {
    static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(3);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(10);
        b.add(20);
        b.add(30);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        System.out.println(arr );
        System.out.println("\n");

        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }
        System.out.println("\n");

        for(ArrayList<Integer> list : arr){
            for(int el : list){
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}
