package GFG.STRINGS;

import java.util.Scanner;

public class basic {
    static void main(String[] args) {
        String aryan = "hey google";
        System.out.println(aryan);
        Scanner input = new Scanner(System.in);
//        String NEW = input.next();           next() will only print a word. not after space
        String NEW = input.nextLine();        /*always use this one*/
        System.out.println(NEW);

        /*.charAt()*/ //index daalo to print char in a string.
        /*.length()*/  //to print length of the string- remember the brackets. arraylist mein .size()
    }
}
