package _6Binary_Search;

public class _7singlesAmongDoubles {
    class Solution {
        int single(int[] arr) {
            // code here
            int n = arr.length;
            int lo=0;
            int hi= arr.length-1;
            if (arr.length==1) return arr[0];
            if(arr[0]!=arr[1]) return arr[0];
            if(arr[n-1]!= arr[n-2]) return arr[n-1];
            while(lo<=hi){
                int mid = lo+(hi-lo)/2;
                if(arr[mid]!=arr[mid-1]&&arr[mid]!=arr[mid+1]) return arr[mid];
                int f=mid,s=mid;
                if(arr[mid]==arr[mid-1]) f=mid-1;
                if(arr[mid]==arr[mid+1]) s=mid+1;
                int leftcount = f-lo;
                int rightcount=hi-s;
                if(leftcount%2==0) lo=s+1;
                else hi=f-1;
            }
            return -1;
        }
    }
}
