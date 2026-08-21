package xCHALLENGES_02;
import java.util.Scanner;
public class doWhilePASS_CHECKER {
    static void main(String[] args) {
        Scanner input=  new Scanner(System.in);
        String pass;
        do {
            System.out.print("Enter a valid password: ");
            pass= input.next();
            if(!isPassword(pass)) System.out.println("Invald Password Enter again!!");

        } while(!isPassword(pass));
        System.out.println("Thanks for entering valid password");

    }

    public static boolean isPassword(String password){
        return password.length()>6;
    }

}
