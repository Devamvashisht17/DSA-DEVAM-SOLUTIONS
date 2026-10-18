class Solution {
    public int minDeletions(int[] nums) {
        int count=0;

        for(int i=0;i<nums.length-1;i++){
            if((nums[i] ^ nums[i+1]) == 0){
                count++;
            }
        }
        return count;
    }
}