package GFG.RECURSION;

public class LC_lookAndSayPattern {
    public static String pattern(int n){
        if (n==1) return "1";
        String s = pattern(n-1);
        String ans="";
        int i=0,j=0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++;
            else{
                int freq=j-1;
                ans+=freq;
                ans+=s.charAt(i);
                i=j;
            }
        } /*for last iteration*/
        int freq=j-1;
        ans+=freq;
        ans+=s.charAt(i);
        i=j;
        return ans;


    }
}
