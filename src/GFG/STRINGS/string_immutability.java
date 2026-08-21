package GFG.STRINGS;

public class string_immutability {
    static void main(String[] args) {
        String s = "Bishal";    //0B 1i 2s 3h 4a 5l index
        s = s.substring(0,3)+"m"+s.substring(4,6);  /*Bismal*/
        System.out.println(s);
    }
}
