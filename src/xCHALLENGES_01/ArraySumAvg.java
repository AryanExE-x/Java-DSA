package xCHALLENGES_01;

public class ArraySumAvg {
    static void main(String[] args) {
        System.out.println("Welcome to Array Sum and Average Program");
        int[] numArray= ArrayUtility.inputArray();
        long sum=sum(numArray);
        double avg=average(numArray);

        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The average of the numbers is: " + avg);

    }

    public static long sum(int[] numArray){
        int i=0;
        long sum=0;
        int size=numArray.length;
        while(i<size){
            sum+=numArray[i];
            i++;
        }
        return sum;
    }

    public static double average(int[] numArray){
        int i=0;
        double ansAvg=0;
        int size=numArray.length;
        while(i< size){
            ansAvg=(double)sum(numArray) /(size);
            i++;
        }
        return ansAvg;
    }

}
