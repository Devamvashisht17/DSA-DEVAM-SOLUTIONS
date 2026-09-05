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
        int a = max+1;  // front
        int b= n- min; //back

        int c= min+1 + n-max; // both

        return Math.min(a,Math.min(b,c));
    }
}