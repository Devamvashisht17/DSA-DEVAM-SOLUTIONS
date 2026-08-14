class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int left=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        int tempsum=0;
        int templeft=0;

        for(int i=0;i<nums.size();i++){
            sum=sum+nums.get(i);

            while(i-left+1> r){
                sum=sum-nums.get(left);
                left++;
            }
            templeft=left;
            tempsum=sum;
            while(i-templeft+1 >= l){
                if(tempsum>0){
                    min=Math.min(tempsum, min);
                }
                tempsum=tempsum-nums.get(templeft);
                templeft++;
            }
        }
        if(min == Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}