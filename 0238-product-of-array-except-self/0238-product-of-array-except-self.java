class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int [] arr= new int[n];
        int prefix= 1;
        for(int i=0;i<n;i++){
            arr[i]=prefix;
            prefix =prefix*nums[i];
        }
        int suffix=1;
        for(int i=nums.length-1;i>=0;i--){
            arr[i]= arr[i] * suffix;
            suffix=suffix* nums[i];
        }
        return arr;
    }
}