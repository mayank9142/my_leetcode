package _6Binary_Search;

public class _3first_last_occ {
    class Solution {
        public int[] searchRange(int[] arr, int tar) {
            int lo=0,hi=arr.length-1,idx1=-1,idx2=-1;
            int[] ans={-1,-1};
            while(lo<=hi){
                int mid =(lo+hi)/2;
                if(arr[mid]<tar) lo=mid+1;
                else if(arr[mid]>tar) hi=mid-1;
                else{
                    ans[0]= mid;
                    hi=mid-1;
                }
            }
            lo=0;
            hi=arr.length-1;
            while(lo<=hi){
                int mid =(lo+hi)/2;
                if(arr[mid]<tar) lo=mid+1;
                else if(arr[mid]>tar) hi=mid-1;
                else{
                    ans[1]= mid;
                    lo=mid+1;
                }
            }


            return ans;
        }
    }
}
