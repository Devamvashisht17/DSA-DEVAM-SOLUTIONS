class Solution {
    public int minimumDeletions(int[] nums) {
        int n= nums.length;
        int min=0;
        int max=0;

        for(int i=0;i<n;i++){
            if(nums[i]<nums[min]){
                min=i;
            }
            if(nums[i]> nums[max]){
                max=i;
            }
        }
        if(min> max){
            int temp= min;
            min= max;
            max=temp;
        }
        int front = max+1;
        int back= n- min;

        int both= min+1 + n-max;

        return Math.min(front,Math.min(back,both));
    }
}