package xCHALLENGES_01;

public class ArrayIsPalindromeSwapping {
    public static void main(String[] args){
        int[] numArr=ArrayUtility.inputArray();
        boolean isPalindrome=isPalindromeSwap(numArr);
        if(isPalindrome) System.out.println("The array is a Palindrome");
        else System.out.println("The array is not a Palindrome");
    }

    public static boolean isPalindromeSwap(int[] numArr){
        int i=0;
        while(i<numArr.length/2){
            if(numArr[i]!=numArr[numArr.length-1-i]){
                return false;
            }
            i++;
        }
        return true;
    }

}
