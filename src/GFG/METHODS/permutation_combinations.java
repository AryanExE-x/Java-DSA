package GFG.METHODS;

import java.util.Scanner;

public class permutation_combinations {

    public static int factorial(int num){
        int res=1;
        for(int i=1;i<=num;i++){
            res*=i;
        }
        return res;
    }

    public static int ncr(int n,int r){
        return (factorial(n))/(factorial(r)*factorial(n-r));
    }

    public static int npr(int n,int r){
        return (factorial(n))/(factorial(n-r));
    }

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int r=input.nextInt();

        int nFact=factorial(n);
        int rFact=factorial(n);
        int nrFact=factorial(n-r);

        int ncr=nFact/(rFact*nrFact);
        int npr=nFact/nrFact;
        System.out.println("NCR is: " + ncr);
        System.out.println("NPR is: " + npr);

    }
}
