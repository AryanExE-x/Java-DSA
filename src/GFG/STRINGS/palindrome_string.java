package GFG.STRINGS;

public class palindrome_string {
    static boolean isPalindrome(String str){
         int i=0; int j=str.length()-1;
         while(i<=j){
             if(str.charAt(i)!=str.charAt(j)) return false; /*no need of else coz return will break code*/
             i++;
             j--;
         }
         return true;
    }
}
