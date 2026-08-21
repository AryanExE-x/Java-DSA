package xUNIT1;

import java.util.Scanner;

class ArraySearching {
  static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] arr={3,6,9,90,75,45,6,5,4,56,7,7,6};
    System.out.print("Enter the number to search: ");
    int num=input.nextInt();
    boolean isFound=isFound(arr,num);
    if(isFound) System.out.println("Your number was found in the array");

    else System.out.println("Your number was not found in the array");
  }

  public static boolean isFound(int[] arr,int num){
      int index=0;
      while(index<arr.length){
        if(arr[index]==num)return true;
        index++;
      }
      return false;

  }

}
