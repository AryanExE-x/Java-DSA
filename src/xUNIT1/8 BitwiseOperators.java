//BITWISE OPERATORS  numbers ke binary bit pe lagta h operator
// suppose 12 and 13 1100 1101 now if we use and operator compare both 1100 will be the ans
//1100 is 12. therefore ans is 12

package xUNIT1;
import java.util.Scanner;
class BitwiseOperators {
  static void main(String[] args) {
   Scanner input= new Scanner(System.in);
   System.out.print("Enter the first number: ");
   int a= input.nextInt();
   System.out.print("Enter the second number: ");
   int b= input.nextInt();

   int resultAnd= a & b;
   System.out.println("The result for AND is: " + resultAnd);

   int resultOr= (a | b);
   System.out.println("The result for OR is: " + resultOr);

   int resultXor= a ^ b; // dono mein se ek hi 1 hona chahiye toh ans 1..dono hue toh ans 0
   System.out.println("The result for XOR is: " + resultXor);

   int resultNotA= ~a;    /*Bitwise Compliment or NOT*/
   int resultNotB= ~b;
   System.out.println("The result for NOT a is: " + resultNotA);
   System.out.println("The result for NOT b is: " + resultNotB);

   int leftShiftA= a << 1;
   System.out.println("Left Shift of a is: " + leftShiftA);

   int rightShiftB= b >> 1;
   System.out.println("Right Shift of b is: " + rightShiftB);
  }
}

/*     DECIMAL       BINARY */
//      0              0000    .
//      1              0001    .
//      2              0010    .
//      3              0011    .
//      4              0100    .
//      5              0101    .
//      6              0110    .
//      7              0111    .
//      8              1000    .
//      9              1001    .
//     10              1010    .
//     11              1011    .
//     12              1100    .
//     13              1101    .
//     14              1110    .
//     15              1111    .
