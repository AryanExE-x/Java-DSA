package xUNIT1;
import java.util.Scanner;
 class TwoDArray {
  public static void main(String[] args){
   Scanner input =  new Scanner(System.in);

   int[][] myArr= new int[2][3];
   myArr[0][0]=9;
   // .. . . . ..
   System.out.println(myArr[0][0]);

   int[][] arr={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
   System.out.println(arr.length);  //outer bracket - 4 rows
   System.out.println(arr[0].length);  //inner bracket 1st row's 3 elements

   System.out.println("\n");
/*ARRAY TRAVERSAL*/
   int i=0;
   while (i<arr.length){
    int j=0;
    while(j<arr[i].length){
     System.out.print(arr[i][j] + " ");
     j++;
    }
    System.out.println();
    i++;
   }


  }
}
