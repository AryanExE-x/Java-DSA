package xCHALLENGES_01;

public class Array2DSumAvg {
    static void main(String[] args){
        int[][] numArr=ArrayUtility.input2DArray();
        long sum=sum(numArr);
        double avg=avg(numArr);
        System.out.println("Sum of array elements is: " + sum);
        System.out.println("Average of array elements is: " + avg);
    }
    public static long sum(int[][] numArr){
        long sum=0;
        int i=0;
        while(i<numArr.length){
            int j=0;
            while(j<numArr[i].length){
                sum+=numArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
    public static double avg(int[][] numArr){
        double avg=0;
        if(numArr.length==0) return 0;
        int rows=numArr.length;
        int columns=numArr[0].length;  /*assuming homogeneous array*/
        avg = (double)(sum(numArr))/(rows*columns);
        return avg;
    }
}
