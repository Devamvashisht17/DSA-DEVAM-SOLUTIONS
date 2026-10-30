class Solution {
    public int rob(int[] nums) {
        int prev2=0, prev1=0;

        for(int i=0;i<nums.length;i++){
            int curr= Math.max(prev1, prev2+nums[i]);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}