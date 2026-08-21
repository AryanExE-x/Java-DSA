package GFG.PATTERN_PRINTING;

import java.util.Scanner;

public class star_plus {
    static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num=input.nextInt();
    for(int i=1;i<=num;i++){
        for(int j=1;j<=num;j++){
            if(j==((num/2)+1) || i==((num/2)+1) ){
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
