class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        int sum=0;
        int max= Integer.MIN_VALUE;
        for(int num : nums){
            max= Math.max(num, max);

            if(num>0 && set.add(num)){
                sum=sum+ num;
            }
        }
        if(sum>0){
            return sum;
        }
        else{
            return max;
        }
        }
}