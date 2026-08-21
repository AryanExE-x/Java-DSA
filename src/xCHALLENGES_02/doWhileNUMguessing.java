package xCHALLENGES_02;
import java.util.Scanner;
public class doWhileNUMguessing {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=7;
        int guess;
        int count=0;
        do{
            System.out.println("Guess a number b/w 1-10");
            guess=input.nextInt();
            count++;
        } while(guess!=num);
        System.out.println("Congrats! you have guessed it right!! in the " + count + " th attempt!");
    }
}
