class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int sum=0;
        int min= nums[0];

        for(int i=0;i<n;i++){
            sum=sum+nums[i];    
        
        if(nums[i] < min){
            min= nums[i];
        }
        }
        return sum -n*min;
    }
}