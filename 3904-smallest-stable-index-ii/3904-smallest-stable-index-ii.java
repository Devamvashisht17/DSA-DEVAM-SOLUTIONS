class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;

        int [] prefixmax= new int[n];
        int [] suffixmin= new int[n];

        prefixmax[0]= nums[0];

        for(int i=1;i<n;i++){
            prefixmax[i]=Math.max(prefixmax[i-1], nums[i]);
        }
        suffixmin[n-1]= nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffixmin[i]= Math.min(suffixmin[i+1], nums[i]);
        }
        for(int i=0;i<n;i++){
            int score= prefixmax[i] -suffixmin[i];
            if(score <=k){
                return i;
            }
        }
        return -1;
        
    }
}