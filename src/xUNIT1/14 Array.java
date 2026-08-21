package xUNIT1;
import java.util.Scanner;
 class Array {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("The array is");

//   int[] myArr = new int[5];
//   myArr[0]=5;
//   myArr[1]=15;
//   myArr[2]=25;
//   myArr[3]=35;
//   myArr[4]=45;

   int[] myArr={5,15,25,35,45};

//   int index=2;

//   System.out.println(myArr[0]);
//   System.out.println(myArr[1]);
//   System.out.println(myArr[index]);
//   System.out.println(myArr[3]);
//   System.out.println(myArr[4]);
   /*if index is out of size: ArrayIndexOutofBoundsExcepion*/

   /*ARRAY TRAVERSAL*/
   int index=0;
   while(index < myArr.length) {         //while(index<5){
    System.out.print(myArr[index] + " ");
    index++;
   }
   System.out.println();

   String[] strArr= new String[4];
   strArr[0]="MyString";
   System.out.println(strArr.length);
   System.out.println(strArr[0]);
   System.out.println(strArr[0].length());

   String[] newStrArr= {"first","second","third"};
   System.out.println(newStrArr.length);

  }
}
