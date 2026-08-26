package GFG.ARRAYS;

public class null_character {
    static void main(String[] args) {
        char ch='\0';                   //null character
        System.out.println((int)ch);
        int x=0;                        //null character
        System.out.println((char)x);
        String[] arr={"Aryan","Abhinav"};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(2%5);
        System.out.println(2/5);
    }
}
