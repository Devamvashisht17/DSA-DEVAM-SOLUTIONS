class Solution {
    public int maxDigitRange(int[] nums) {
        int sum=0;
        int maxrange=-1;
        for(int i=0;i<nums.length;i++){
            int num= nums[i];
            int max= Integer.MIN_VALUE;
            int min= Integer.MAX_VALUE;
            while(nums[i]!=0){
                int rem= nums[i]%10;

                if(rem>max){
                    max= rem;
                }
                if(rem<min){
                    min= rem;
                }
                nums[i]=nums[i]/10;
            }
            int range= max-min;

            if(maxrange<range){
                maxrange= range;
                sum=num;
            }
            else if(range==maxrange){
                sum=sum+num;
            }
        }
        return sum; 

    }
}