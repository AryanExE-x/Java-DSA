package GFG.LOOPS;
import java.util.Scanner;
public class prime_or_not {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a num: ");
        int n=sc.nextInt();
        boolean flag=true; //true means prime
        for(int i=2;i<n;i++){
            if(n%i==0) {
                flag=false;  //false means composite
                break;
            }
        }
        if(n==1) System.out.println("Neither prime nor composite");
        else if(!flag)System.out.println("The number is composite");
        else System.out.println("The number is prime");
    }
}
