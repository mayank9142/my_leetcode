
class Solution {
    public int maximumCount(int[] arr) {
        // int countp=0,countn=0;
        // for(int i =0;i<nums.length;i++){
        //     if(nums[i]>0) countp++;
        //     else if(nums[i]<0) countn++;
        // }
        // if(countp>countn) return countp;

//         int n = nums.length;
//         int lo = 0, hi = n - 1;
//         int firstZero = n;
//         while (lo <= hi) {
//             int mid = lo + (hi - lo) / 2;
//             if (nums[mid] >= 0) {
//                 firstZero = mid;
//                 hi = mid - 1;
//             } else {
//                 lo = mid + 1;
//             }
//         }
//         lo = 0;
//         hi = n - 1;
//         int firstPos = n;
//         while (lo <= hi) {
//             int mid = lo + (hi - lo) / 2;
//             if (nums[mid] > 0) {
//                 firstPos = mid;
//                 hi = mid - 1;
//             } else {
//                 lo = mid + 1;
//             }
//         }
//         int countNeg = firstZero;
//         int countPos = n - firstPos;
//         return Math.max(countNeg, countPos);
//     }
// }
        int n=arr.length;
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid= lo+ (hi-lo)/2;
            if(arr[mid]>=0) hi=mid-1;
            else lo=mid+1;
        }
        int negcount=lo;
        lo=0;
        hi=arr.length-1;
        while(lo<=hi){
            int mid= lo+ (hi-lo)/2;
            if(arr[mid]<=0) lo=mid+1;
            else hi=mid-1;
        }
        int poscount=n-lo;
        return Math.max(negcount, poscount);
    }
}