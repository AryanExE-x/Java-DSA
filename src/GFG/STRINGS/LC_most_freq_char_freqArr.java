package GFG.STRINGS;

public class LC_most_freq_char_freqArr { /*FREQUENCY ARRAY*/
    public static char maxOccChar(String s){
            int n=s.length();
            int[] freq= new int[26]; //26 alphabets by default sabme 0 hi hoga.
            for(int i=0;i<n;i++){
                char ch=s.charAt(i);
                int idx= ch-97;
                freq[idx]++;
            }
            int maxFreq=0;
            char ans=s.charAt(0);
            for(int i=0;i<26;i++){
                if(freq[i]>maxFreq){
                    maxFreq=freq[i];
                    ans= (char)(i + 97);
                }
            }
            return ans;
    }
}