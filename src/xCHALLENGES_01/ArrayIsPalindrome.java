package xCHALLENGES_01;

public class ArrayIsPalindrome {
    public static void main(String[] args) {
        int[] numArr=ArrayUtility.inputArray();
        boolean isPalindrome=isPalindrome(numArr);
        if(isPalindrome) System.out.println("The array is a Palindrome");
        else System.out.println("The array is not a Palindrome");
    }

    public static boolean isPalindrome(int[] numArr){
        int i=0;
        int size=numArr.length;
        int[] revArr=new int[size];
        while(i<size){
            revArr[i]=numArr[size-1-i];    /*loop to create a reverse array*/
            i++;
        }

        int j=0;
        while(j<size){
            if(revArr[j]!=numArr[j]) return false;        /*=> loop to check all the elements*/
            j++;
        }
        return true;
    }
}
