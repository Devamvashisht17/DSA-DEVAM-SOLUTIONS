class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        
        while(sum>=target){
            min=Math.min(min, i-left+1);
            sum=sum-nums[left];
            left++;
        }
        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }
        
        return min;
        

    }
}