package GFG.LOOPS;
import java.util.Scanner;
public class ArithmeticProgression {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter first term of the AP: ");
        int a=input.nextInt();
        System.out.print("Enter difference between each term: ");
        int d=input.nextInt();
        System.out.print("Enter number of terms: ");
        int n=input.nextInt();
        System.out.println("The AP is..");
        for(int i=a;i<=a+(n-1)*d;i+=d){   /* last term= first term + (n-1)d */
            System.out.printf("%d ",i);
        /*sum = n/2(first+last term) -> n/2(2a+(n-1)*d) */
        }
    }
}
