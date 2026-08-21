package GFG.ARRAYS.ARRAYLIST_VECTORS;
//function for adding one to the array
import java.util.Vector;
import java.util.Collections;
public class LC_adding_one {
    /*function as a vector return type also vector array, where vector datatype is Integer*/
        Vector<Integer> addOne(int[] arr){
            Vector<Integer> ans = new Vector< >();
            int n = arr.length;
            int carry=1;
            for(int i=n-1;i>=0;i--){
                if(arr[i]+carry<=9){
                    ans.add(arr[i]+carry);
                    carry=0;  //agli baar carryforward ke liye 0 since its already added now
                }
                else{  //agar arr[i]+carry==10;
                    ans.add(0);
                    carry=1;  //for next iteration.
                }
            }/*imp case after loop*/
            if(carry==1) ans.add(1);//in case of 999 we add 1 it becomes 1000.after the iteration agar carry is left

            Collections.reverse(ans);
            return ans;
        }
}
