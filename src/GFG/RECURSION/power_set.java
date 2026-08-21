package GFG.RECURSION;

import java.util.*;  /*WILDCARD!!*/

/*abcde->set
* ace-> subsequence/subset */
//set->2^n subsets. n->length of set..
public class power_set { /*all subsets return that too in lexicographical order(sort kardo)*/
    public static void subsets(String ans, String s , int idx, List<String> list){
        if(idx==s.length()){
            if(ans.length()!=0) list.add(ans); //so that empty substring na aaye
            return;
        }
        char ch=s.charAt(idx);
        subsets(ans+ch,s,idx+1,list); //pick
        subsets(ans,s,idx+1,list); //skip.
        //reverse the order of recursive calls to reverse lexicographical order...
    }

    static void main(String[] args) {
        String s= "abc";
        List<String> list=new ArrayList<>();
        subsets("",s,0,list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
