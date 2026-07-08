class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int lar_count=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                if(count>= lar_count){
                    lar_count=count;
                }
            }
            else{
                count=0;
            }
        }
        return lar_count;
    }
}