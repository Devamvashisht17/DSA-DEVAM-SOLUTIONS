class Solution {
    public int maxSubArray(int[] nums) {
        long max= Long.MIN_VALUE;

        long sum=0;

        for(int i=0;i<nums.length;i++){
            sum=sum+ nums[i];
        if(sum>max){
            max=sum;
        }
        if(sum<0){
            sum=0;
        }
        }
        return (int)max;
    }
}