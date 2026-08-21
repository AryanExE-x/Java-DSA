package GFG.ARRAYS;

public class second_max {
    static void main(String[] args) {
        int[] arr={1,23,10,10,2,6,7};
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            else if(arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.println("Max is: " + max);
        System.out.println("Second Max is: " + smax);
        System.out.println();
        System.out.println("Using two for loops");
        System.out.println();
        int[] brr={11,12,13,14,11,12};
        int maximum2=Integer.MIN_VALUE;
        int secondmaxmimum2= Integer.MIN_VALUE;
        for(int i=0;i<brr.length;i++){
            if(brr[i]>maximum2){
                maximum2=brr[i];
            }
        }
        for(int i=0;i<brr.length;i++){
            if(brr[i]>secondmaxmimum2 && brr[i]!=maximum2){
                secondmaxmimum2=brr[i];
            }
        }
        System.out.println("Max is: " + maximum2);
        System.out.println("Second Max is: " + secondmaxmimum2);
    }
}
