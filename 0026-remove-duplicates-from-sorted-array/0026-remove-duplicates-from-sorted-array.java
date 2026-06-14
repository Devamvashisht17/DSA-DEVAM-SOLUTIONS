class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
        int n=nums.length-1;

        for(int i=0;i<=n;i++){
            if(nums[i] != nums[j-1]){
                nums[j++]= nums[i];
            }
        }
        return j;
    }
}