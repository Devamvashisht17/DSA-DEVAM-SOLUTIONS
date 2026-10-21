class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int xor=0;

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] ==  nums[j]){
                    xor=xor ^ nums[i];
                }
            }
        }
        return xor;
    }
}