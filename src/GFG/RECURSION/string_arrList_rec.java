package GFG.RECURSION;

import java.util.ArrayList;
import java.util.List;

public class string_arrList_rec {
    public static void main(String[] args){
        /*!String individually pass by ref nahi hogi*///passing in method-> pass by value(copy of str)
        /*?String ki array pass by ref  hogi*/
        /*?String ki arrayList pass by ref hogi*/
        ArrayList<String> al = new ArrayList<>(); /*pass by reference hoti hai*/
        List<String> all = new ArrayList<>(); /*pass by reference hoti hai*/ //arrayList==List...
        al.add("Aryan");
        al.add("ekansh");
        al.add("abhinav");
        al.add("anant");
        System.out.print(al + " ");
        change(al);
        System.out.println();
        System.out.print(al + " ");
    }
    public static void change(ArrayList<String> al){
        al.add("agrim");
    }
}
