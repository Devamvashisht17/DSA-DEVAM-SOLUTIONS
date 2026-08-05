class Solution {
    public int gcd(int a, int b){
        while(b!=0){
            int temp= b;
            b= a%b;
            a=temp;
        }
        return a;
    }
    public long maxPairStrength(int[] nums) {
        long max=0;

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int a=nums[i];
                int b= nums[j];

                int g= gcd(a,b);
                long strength= (long)(a/g)*(b/g);

                max= Math.max(max, strength);
            }
        }
        return max;
    }
}