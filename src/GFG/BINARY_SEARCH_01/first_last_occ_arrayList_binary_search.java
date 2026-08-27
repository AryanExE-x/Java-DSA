package GFG.BINARY_SEARCH_01;

import java.util.ArrayList;

public class first_last_occ_arrayList_binary_search {
    public static ArrayList<Integer> find(int[] arr,int tar){
        ArrayList<Integer> ans = new ArrayList<>();

        //first occurrence..

        int n=arr.length;
        int lo=0; int hi=n-1; int index=-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]<tar) lo=mid+1;
            else if(arr[mid]>tar) hi=mid-1;
            else{
                index=mid;
                hi=mid-1;
            }
        }
        ans.add(index);



        //last occurrence..

        lo=0; hi=n-1; index=-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]<tar) lo=mid+1;
            else if(arr[mid]>tar) hi=mid-1;
            else{
                index=mid;
                lo=mid+1;
            }
        }
        ans.add(index);
        return ans;
    }
}
