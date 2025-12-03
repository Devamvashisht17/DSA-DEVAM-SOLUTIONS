class Solution {
    public int[] findErrorNums(int[] nums) {
        int n= nums.length;
        int found=0;
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                found=nums[i];
                break;
            }}
            int sum_arr=0;
            for(int j=0;j<n;j++){
                sum_arr= sum_arr+nums[j];
            }
            int sum_no=n*(n+1)/2;
            int missing =(sum_no-(sum_arr-found));
            return new int[]{found, missing};

        }
}