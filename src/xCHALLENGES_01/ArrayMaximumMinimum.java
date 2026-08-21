package xCHALLENGES_01;

public class ArrayMaximumMinimum {
    static void main(String[] args) {
        System.out.println("Welcome to Max and Min Program");
        int[] numArr = ArrayUtility.inputArray();
        int max=max(numArr);
        int min=min(numArr);
        System.out.println("The maximum number in the array is: " + max );
        System.out.println("The minimum number in the array is: " + min );
    }

    public static int max(int[] numArr){

        if(numArr.length==0){    /*exclusive*/
            return Integer.MIN_VALUE;
        }

        int max=numArr[0];
        int i=1;
        while(i< numArr.length){
            if(numArr[i]>max){
                max=numArr[i];
            }
            i++;
        }
        return max;
    }

//    public static int min(int[] numArr){
//        int min=numArr[0];
//        int i=1;
//        while(i< numArr.length){
//            if(numArr[i]<min){
//                min=numArr[i];
//            }
//            i++;
//        }
//        return min;
//    }

    public static int min(int[] numArr){
        int min = Integer.MAX_VALUE;
        int i=0;
        while(i<numArr.length){
            if(numArr[i]<min){
                min=numArr[i];
            }
            i++;
        }
        return min;
    }



}
