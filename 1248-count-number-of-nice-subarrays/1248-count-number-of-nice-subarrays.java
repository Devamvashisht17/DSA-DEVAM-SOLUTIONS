class Solution {
    public int atmost(int nums[], int k){
        int sum=0;
        int left=0;
        int count=0;

        for(int right=0;right<nums.length;right++){
            sum=sum+(nums[right]%2);

            while(sum>k){
                sum=sum-(nums[left]%2);
                left++;
            }
            count=count - right-left+1;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums, k) - atmost(nums, k-1);
    }
}