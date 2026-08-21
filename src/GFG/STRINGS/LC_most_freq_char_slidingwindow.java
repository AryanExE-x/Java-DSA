package GFG.STRINGS;
import java.util.Arrays;
public class LC_most_freq_char_slidingwindow {
    public static char maxOccChar(String s){
        int n=s.length();
        int maxFreq=-1;
        char ans = s.charAt(0);
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        int i=0,j=0;
        while(j<n){
            if(arr[i]==arr[j]) j++;
            else{ //arr[i]!=arr[j]
                int freq=j-i;
                if(freq>maxFreq){
                    maxFreq=freq;
                    ans=arr[i];
                }
                i = j;
            }
        }
        int freq=j-i;   /*last char ke liye*/
        if(freq>maxFreq){
            maxFreq=freq;
            ans=arr[i];
        }
        return ans;
    }
}
