package GFG.STRINGS;

public class equals {
    static boolean isEqual(String a, String b){
        if(a.length()!=b.length()) return false;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)) return false;
        }
        return true;
    }

    static void main(String[] args) {
        String s1="Raghav";
        String s2= new String("Raghav"); //new string hai ye. pointing to diff strings
        System.out.println(s1==s2); /*returns false*/ //locations compare hongi,addresses. dono location alag h
        System.out.println(s1.equals(s2)); /*returns true*/ //?compares char by char

    }
}
