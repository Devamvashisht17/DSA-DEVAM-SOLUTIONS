class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int count=0;
        int left=0;
        int product=1;
        for(int i=0;i<nums.length;i++){
            product=product*nums[i];

            while(product>=k){
                product=product/nums[left];
                left++;
            }
            if(product<k){
                count=count+i-left+1;

            }
        }
        return count;
    }
}