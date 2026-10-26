class Solution {
    public int gcd(int a, int b){

        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }
    public boolean isGoodArray(int[] nums) {
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            ans =gcd(nums[i], ans);
            if(ans==1){
                return true;
            }
        }
        return ans==1;
    }
}