package _8_Recursion;

public class _14_recursivebsearch {
    class Solution {
        public int search(int[] nums, int target) {
            return recBinary(nums,target,0,nums.length-1);
        }
        public static int recBinary(int[] nums,int target,int lo,int hi){
            if(lo>hi) return -1;
            int mid=lo+(hi-lo)/2;

            if(nums[mid]==target) return mid;
            if(nums[mid]>target)  return recBinary(nums,target,lo,mid-1);
            return  recBinary(nums,target,mid+1,hi);
        }
    }
}
