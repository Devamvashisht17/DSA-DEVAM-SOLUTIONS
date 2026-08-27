class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] arr= new int[nums.length];
        int prefix=1, suffix=1;
        for(int i=0;i<nums.length;i++){
            arr[i]= prefix;
            prefix=prefix*nums[i];
        }
        for(int j=nums.length-1;j>=0;j--){
            arr[j]=arr[j]*suffix;
            suffix= suffix*nums[j];
        }
        return arr;
    }
}