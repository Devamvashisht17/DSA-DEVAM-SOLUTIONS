class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int n= nums.length;
        int maxSum=0;
        int left=0;

        for(int i=0;i<k;i++){
            sum=sum+nums[i];
            
        }
        maxSum=sum;
        for(int i=k;i<n;i++){
            sum=sum-nums[i-k];
            sum=sum+nums[i];

            maxSum=Math.max(maxSum, sum);
        }
        return (double)maxSum/k;
        
    }
}