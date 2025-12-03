class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int found_f=-1;
        int found_l=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                found_f=i;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(nums[i]==target){
                found_l=i;
            }
        }
        return new int []{found_l, found_f};
    }
}