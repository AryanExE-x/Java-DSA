package GFG.ARRAYS;

public class linear_search_inarray {                     //?linear search
    static void main(String[] args) {
        int[] arr={2,335,254,325,3211,2,1223,12};
        int num=2;
        boolean isPresent=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                System.out.println("Target found at " + i + " th index.");
                isPresent=true;
            }

        }
        if(!isPresent) System.out.println("The number is not present in the array");

    }
}
