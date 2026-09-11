class Solution {
    public int minimumSwaps(int[] nums) {
        int count=0;
        int start=0;
        int end=nums.length-1;

        while(start< end){
            if(nums[start] !=0){
                start++;
            }
            else if(nums[end]==0){
                end--;
            }
            else{
                int temp= nums[start];
                nums[start]= nums[end];
                nums[end]=temp;
                count++;
                start++;
                end--;
            }
        }
        return count;
    }
}