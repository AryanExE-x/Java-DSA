package GFG.MERGE_SORT;

import xCHALLENGES_01.ArrayUtility;

import static java.nio.file.Files.delete;

/*make 2 empty arrays of n/2 each and copy paste original elements to them*/
public class mergeSortUsingMAGIC {
    static void main(String[] args) {
        int[] arr={23,12,13,6,56,77,8,15,1};
        mergeSort(arr);
        for(int el : arr) System.out.print(el + " ");
        System.out.println();
    }
/*INTUITION=>DIVIDE N CONQUER TECHNIQUE*/

    static void mergeSort(int[] arr){
        int n=arr.length;
        if(n==1) return; /*1 array length is already sorted -> BASE CASE*/
        int[] a = new int[n/2];  //create two empty arrays. of n/2 size each.
        int[] b = new int[n-n/2];
        /*copy paste elements into a and b*/
        int idx=0; //idx travel krega arr pe
        for(int i=0;i<a.length;i++){
            a[i]=arr[idx];
            idx++;
        }
        for(int i=0;i<b.length;i++){
            b[i]=arr[idx];
            idx++;
        }

        /*APPLY MAGIC ON A AND B*/
        mergeSort(a);  //MAGIC->>RECURSION...
        mergeSort(b); //! YAHA TAK KA KAAM THA TODNA
        /*merge a and b into arr*/
        mergeArr(a,b,arr); //? YAHA KA KAAM HAI JODNA


    }

    public static void mergeArr(int[] a, int[] b, int [] c){
        int i=0,j=0,k=0;
        while (i<a.length && j <b.length){
            if(a[i]<=b[j]){
                c[k]=a[i];
                i++;
                k++;
            }
            else{
                c[k]=b[j];
                j++;
                k++;
            }
        } /*for extra elements in single array*/
        while (i<a.length) c[k++]=a[i++];
        while (j<b.length) c[k++]=b[j++];
    }
}
