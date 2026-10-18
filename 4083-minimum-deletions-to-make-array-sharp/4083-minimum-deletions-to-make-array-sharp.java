class Solution {
    public int minDeletions(int[] nums) {
        int k=0;

        for(int i=0;i<nums.length-1;i++){
            if((nums[i] ^ nums[i+1]) == 0){
                k++;
            }
        }
        return k;
    }
}