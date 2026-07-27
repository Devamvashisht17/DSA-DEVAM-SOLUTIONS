class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        int sec_max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                sec_max= max;
                max=nums[i];
            }
            else if(nums[i]>sec_max){
                sec_max= nums[i];
            }
        }
        return (max-1) * (sec_max-1);
    }
}