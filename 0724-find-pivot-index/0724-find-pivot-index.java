class Solution {
    public int pivotIndex(int[] nums) {
        for(int pivot=0;pivot<nums.length;pivot++){
            int leftsum=0;
            int rightsum=0;

            for(int i=0;i<pivot;i++){
                leftsum+=nums[i];
            }
            for(int i=pivot+1;i<nums.length;i++){
                rightsum+=nums[i];
            }
            if(leftsum==rightsum){
                return pivot;
            }
        }
        return -1;
    }
}