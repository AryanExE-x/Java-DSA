package GFG.STRINGS;

import java.util.Arrays;

public class LC_anagram {  // anagram - nagaram. jumble krne pe same. listen - silent.
    static boolean areAnagram(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
    }
}
