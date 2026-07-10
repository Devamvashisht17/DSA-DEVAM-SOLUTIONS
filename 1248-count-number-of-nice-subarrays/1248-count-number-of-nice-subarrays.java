class Solution {
    public int atmost(int nums[], int k){
        int left=0;
        int count=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+= (nums[i]%2);
            while(sum>k){
                sum-=(nums[left]%2);
                left++;
            }
            count=count+i-left+1;
        }
        return count;


    }
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k) - atmost(nums, k-1);
    }
}