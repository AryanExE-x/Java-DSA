package GFG.PATTERN_PRINTING;
import java.util.Scanner;
public class star_rectangle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows=input.nextInt();
        int columns=input.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=columns;j++){
                System.out.print("* ");         //stars in each row
            }
            System.out.println();             //jump to the next row
        }
    }
}
