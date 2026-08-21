package GFG.ARRAYS.ARRAYLIST_VECTORS;
//merge 2 sorted arrays in a single large array
import java.util.Arrays;
public class LC_merge_2_sorted_arr {
    static void main(String[] args) {
        /*using three pointer technique*/
        int[] a={2,5,6,9,20};
        int[] b={1,3,4,5,7,8};
        int[] c= new int[a.length+b.length];
        for(int el:c) System.out.print(el + " ");
        System.out.println();
        merge(c,a,b);
        for(int el:c) System.out.print(el + " ");
        System.out.println();
    }

    static void merge(int[] c, int[] a, int[] b) {
            int i=0, j=0, k=0;
            while (i<a.length && j<b.length){
                if(a[i]<b[j]){
                    c[k]=a[i];
                    i++;
                    k++;
                }
                else{
                    c[k]=b[j];
                    j++;
                    k++;
                }
            }
            if(i==a.length){  //a khatam toh b ke bache elements lelo
                while(j<b.length){
                    c[k]=b[j];
                    j++;
                    k++;
                }
            }
            if(j==b.length){  //b khatam toh a ke bache elements lelo
                while(i<a.length){
                    c[k]=a[i];
                    i++;
                    k++;
                }
            }

    }
}
