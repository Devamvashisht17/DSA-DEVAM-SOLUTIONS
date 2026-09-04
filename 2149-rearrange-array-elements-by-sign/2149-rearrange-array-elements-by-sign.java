class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int [] arr= new int[n];

        int posInd=0, negInd=1;

        for(int i=0;i<n;i++){
            if(nums[i]<0){
                arr[negInd]=nums[i];
                negInd+=2;
            }
            else{
                arr[posInd]=nums[i];
                posInd+=2;
            }
        }
        return arr;
    }
}