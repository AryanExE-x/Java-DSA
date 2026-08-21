//INPUT NAME AND PRINT A WELCOME MESSAGE

package xCHALLENGES_01;

import java.util.Scanner;

public class InputName {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name= scanner.nextLine();
        System.out.println("Welcome " + name + " to IntelliJ Idea");

    }
}
