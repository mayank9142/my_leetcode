package _1Arrays;
class pr2_maxCons1s {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n= nums.length;
        int count =0;
        int maxcount =0;
        for(int i =0;i<n;i++){
            if(nums[i]==1){
                count++;
                if(count>maxcount) maxcount=count;
            }
            else count=0;
        }
        return maxcount;
    }

}