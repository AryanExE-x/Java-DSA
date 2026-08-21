package xCHALLENGES_01;

public class ArraySorting {
    static void main(String[] args) {
        System.out.println("Welcome to Array Sorting Checkpost\n");
        int[] numArr= ArrayUtility.inputArray();
        boolean isInc=isIncreasing(numArr);
        boolean isDec=isDecreasing(numArr);
        if(isInc || isDec) System.out.println("The array is sorted");
        else System.out.println("The array is not sorted");

    }

    public static boolean isIncreasing(int[] numArr){
        int i=1;
        while(i<numArr.length){
            if(numArr[i] < numArr[i-1]) return false;    //IMPORTANT***  (FLAGGING)
           /* ULTA KIA WARNA 1 CASE MEIN TRUE HOJATA W/O CHECKING WHOLE ARRAY *** */
            i++;
        }
        return true;   //poora array check hone ke baad return karega
    }

    public static boolean isDecreasing(int[] numArr){
        int i=1;
        while(i<numArr.length){
            if(numArr[i] > numArr[i-1]) return false;  //ulta again . in case increasing order->return false
            i++;
        }
        return true;
    }


}
