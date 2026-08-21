package xCHALLENGES_02;
import java.util.Scanner;
public class RecursionStringPalindrome {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your string: ");

//      String[] str=new String[]{input.next()};
/*we need to use Arrays.toString(str) in the argument isPalindrome(Arrays.toString(str))*/

        String str=input.next();
        System.out.println("Your string is " +
                (isPalindrome(str) ? "Palindrome"
                                   : "Not Palindrome"));

    }

    public static boolean isPalindrome(String str){
        if (str.length()<=1){
            return true;
        }
        int lastPos=str.length()-1;
        if (str.charAt(0)!=str.charAt(lastPos)){
            return false;
        }
        String newStr=str.substring(1,lastPos); /* range-> [1 to last -1] since lastPos is not included*/
        return isPalindrome(newStr);
    }
}