package xUNIT1;
import java.util.Scanner;
 class GCD {
  public static void main(String args[]) {
   Scanner input = new Scanner(System.in);
   System.out.print("Enter number 1 : ");
   int first=input.nextInt();
   System.out.print("Enter number 2 : ");
   int second=input.nextInt();
   int ans=gcd(first,second);
   System.out.println("GCD is: " + ans);

  }

/*Check for GreatestCommonDivisor in CHALLENGES 01..its much better prog*/
  //CHATGPT SOLUTION
  public static int gcd(int first,int second){
   while(second!=0){
    int temp;
    temp = second;
    second = first % second;
    first = temp;
   }
   return first;

  }

  public static int min(int first,int second){
   /*return Math.min(first,second);*/
   if(first<second) return first;
   else return second;
  }
}
