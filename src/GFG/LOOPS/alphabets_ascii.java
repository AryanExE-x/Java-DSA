package GFG.LOOPS;
import java.util.Scanner;
public class alphabets_ascii {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        for(int i=65;i<=90;i++){
            char ch=(char)i;
            System.out.printf("%d %c",i,ch);
            System.out.println();
        }
        System.out.println();
        for(int i=97;i<=122;i++){
            char ch=(char)i;
            System.out.printf("%d %c",i,ch);
            System.out.println();
        }
    }

}
