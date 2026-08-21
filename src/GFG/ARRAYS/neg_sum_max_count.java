package GFG.ARRAYS;
import java.util.Scanner;
public class neg_sum_max_count {

    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element number " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        System.out.print("The negative elements of the array are: ");
        boolean negative = false;                                     /*?REMEMBER*/ /*flag it*/
        for (int i = 0; i < size; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
                negative = true;
            }
        }
        if (!negative) System.out.print("No negative elements in the array");
        System.out.println("\n");
        System.out.println("The sum of elements ");
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        System.out.print("The sum: " + sum);
        System.out.println("\n");
        System.out.println("Product of elements in the array");
        int prod = 1;
        for (int i = 0; i < size; i++){
            prod *= arr[i];
        }

        System.out.println("\n");
        System.out.println("Max Number in the array");
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print("The max number in the array: " + max);
        System.out.println("\n");
        System.out.println("Min Number in the array");
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("{Product of the array");
        for(int i=0;i<arr.length;i++){

        }
        System.out.println("The Min Number in the array: " + min);
        System.out.println("\n");
        System.out.println("Count of the number mentioned..");
        System.out.print("Enter number to count: ");
        int num = input.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                count++;
            }
        }
        System.out.print("The count of the number is : " + count);
        System.out.println("\n");
    }
}
