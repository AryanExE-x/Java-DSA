package xCHALLENGES_01;

public class ArrayReverseSwapping {
    static void main(String[] args) {

        int[] numArr=ArrayUtility.inputArray();
        revSwap(numArr);
        System.out.println("Your reversed array is:-");
        ArrayUtility.displayArr(numArr);
    }

    public static void revSwap(int[] arr){
        int i = 0;
        while(i < arr.length / 2){
            int swap = arr[i];
            arr[i] = arr[(arr.length-1) - i];
            arr[(arr.length-1) - i]=swap;
            i++;
        }
    }

}
