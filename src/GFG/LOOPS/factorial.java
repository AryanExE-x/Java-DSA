package GFG.LOOPS;
import java.util.Scanner;
public class factorial {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n: ");
        int n= sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorial of the number is : " + fact);
        System.out.println();

        for(int k=n;k>1;k--){
            System.out.print(k + " x ");
        }
        System.out.print("1 = " + fact);
    }
}
