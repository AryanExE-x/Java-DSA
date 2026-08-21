package GFG.PATTERN_PRINTING;
import java.util.Scanner;
public class binary_triangle {
    static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n=input.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            if(i==j || (i+j)%2==0){
                System.out.print("1 ");
            }
            else{
                System.out.print("0 ");
            }
        }
        System.out.println();
    }

    }
}
