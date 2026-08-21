package xCHALLENGES_01;

public class ArrayReverse {
    static void main(String[] args) {

        int[] numArr=ArrayUtility.inputArray();
        System.out.println("Here is the new array:-");
        int[] newArr=rev(numArr);
        ArrayUtility.displayArr(newArr);
    }

    public static int[] rev(int[] numArr){
        int i=0;
        int size=numArr.length;
        int[] revArr=new int[size];
        while(i<numArr.length){
            revArr[i]=numArr[size-i-1];
            i++;
        }
        return revArr;

    }

}
