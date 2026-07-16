class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int r=0;r<nums.length;r++){
            sum=sum+nums[r];

            while(sum>=target){
                min= Math.min(min, r-l+1);
                sum=sum-nums[l];
                l++;
            }
        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}