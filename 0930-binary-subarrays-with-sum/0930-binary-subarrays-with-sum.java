class Solution {
    public int atmost(int[] nums, int goal) {
        if (goal < 0) {
            return 0;
        }
        int left = 0, sum = 0, count = 0;
        for (int right = 0; right < nums.length; right++) {
            sum = sum + nums[right];
            while (sum > goal) {
                sum = sum - nums[left];
                left++;
            }
            count = count + (right - left + 1);
        }
        return count;

    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        return atmost(nums, goal) - atmost(nums, goal - 1);

    }
}