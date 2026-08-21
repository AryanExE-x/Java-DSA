package GFG.STRINGS;

public class passingToMethods {
    public static void change(String x){
        x="Abhinav";
    }
    public static void main(String[] args){
        String s="Aryan";
        System.out.println(s);
        change(s);
        System.out.println(s);
        s="Aryan Prasad";
        System.out.println(s);
    } /*immutable hai. pass by value doesnt work same as arrays. normal datatype like integer works*/
}
