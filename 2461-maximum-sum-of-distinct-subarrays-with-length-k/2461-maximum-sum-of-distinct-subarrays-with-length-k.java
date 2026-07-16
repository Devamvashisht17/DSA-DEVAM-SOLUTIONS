class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set= new HashSet<>();

        int l=0;
        long sum=0;
        long max=0;
        for(int r=0;r<nums.length;r++){
            while(set.contains(nums[r])){
                set.remove(nums[l]);
                sum=sum-nums[l];
                l++;
            }
            set.add(nums[r]);
            sum=sum+nums[r];

            if(r-l+1 == k){
                max= Math.max(max, sum);

                set.remove(nums[l]);
                sum=sum-nums[l];
                l++;
            }
        }
        
        return max;
    }
}