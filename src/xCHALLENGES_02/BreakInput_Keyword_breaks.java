package xCHALLENGES_02;
import java.util.Scanner;
public class BreakInput_Keyword_breaks {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Enter your string: ");
            String str=input.next();
            if(str.equalsIgnoreCase("exit")){  /*str.equals but its case sensitive*/
                break;                         //* so we are using equalsIgnoreCase
            }
        }
        System.out.println("Exited the loop!");

    }
}
