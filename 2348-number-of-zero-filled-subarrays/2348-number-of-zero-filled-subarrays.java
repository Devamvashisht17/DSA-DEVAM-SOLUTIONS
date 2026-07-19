class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int l=0;
        long count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count=count+i-l+1;
            }
            if(nums[i] !=0){
                l=i+1;
            }
        }
        return count;
    }
}