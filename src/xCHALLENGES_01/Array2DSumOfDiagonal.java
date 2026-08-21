package xCHALLENGES_01;

public class Array2DSumOfDiagonal {
    static void main(String[] args) {
        int[][] arr=ArrayUtility.input2DArray();
        ArrayUtility.display2DArr(arr);
        long sumOfDiagonals=sumDiag(arr);
        System.out.println("The sum of diagonal elements is: " + sumOfDiagonals);
    }

    public static long sumDiag(int[][]arr){
        long leftSum= LeftsDiag(arr);
        long rightSum= RightsDiag(arr);
        long sum=leftSum+rightSum;
        if(arr.length%2!=0){  /*incase of odd matrix=>>subtract the center element once since its repeating*/
            int index=arr.length/2;    /*integer division->we will get the exact index for odd cases*/
            sum-=arr[index][index];
        }
        return sum;
    }

    public static long LeftsDiag(int[][]arr){
        long sum=0;
        int i=0;
        while(i<arr.length){
            sum+=arr[i][i];
            i++;
        }
        return sum;
    }

    public static long RightsDiag(int[][]arr){
        long sum=0;
        int i=0;
        while(i<arr.length){
            int col=arr.length-1-i;
            sum+=arr[i][col];
            i++;
        }
        return sum;
    }
}
