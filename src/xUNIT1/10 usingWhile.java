package xUNIT1;

import java.util.Scanner;

class usingWhile {
  public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
   System.out.print("Enter a number: ");
   int num=input.nextInt();
   int init=1;
   while(init<=num){
       System.out.print(init + " ");
//       init=init+1;
//       init+=1;
        init++;
   }
  }
}
