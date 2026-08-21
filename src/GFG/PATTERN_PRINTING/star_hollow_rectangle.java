package GFG.PATTERN_PRINTING;
import java.util.Scanner;
public class star_hollow_rectangle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows=input.nextInt();
        int columns= input.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=columns;j++){
                if(i==1 || i==rows || j==1 || j==columns){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
