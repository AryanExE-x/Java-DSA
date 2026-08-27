package GFG.MERGE_SORT;

public class merge2Arr {
    public static void mergeArr(int[] a, int[] b, int [] c){
        int i=0,j=0,k=0;
        while (i<a.length && j <b.length){
            if(a[i]<=b[j]){
                c[k]=a[i];
                i++;
                k++;
            }
            else{ //b[j]<a[i]
                c[k]=b[j];
                j++;
                k++;
            }
        } /*for extra elements in single array*/
        while (i<a.length) c[k++]=a[i++];
        while (j<b.length) c[k++]=b[j++];
    }
}
