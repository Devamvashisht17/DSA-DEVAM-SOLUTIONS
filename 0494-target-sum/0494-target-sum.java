class Solution {
    public int target(int [] nums, int target, int index, int sum){
        if(index == nums.length){
            if(sum == target){
                return 1;
            }
            return 0;

        }
        int add= target(nums, target, index+1, sum + nums[index]);
        int sub= target(nums, target, index+1, sum - nums[index]);

        return add+ sub;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return target(nums, target, 0,0);
    }
}