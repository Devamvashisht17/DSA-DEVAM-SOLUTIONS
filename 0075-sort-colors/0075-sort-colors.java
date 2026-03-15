class Solution {
    public void sortColors(int[] nums) {
        int s=0, e= nums.length-1;
        int mid=0;
        while(mid <=e){
            if(nums[mid] == 0){
                int temp= nums[mid];
                nums[mid]= nums[s];
                nums[s]= temp;

                s++;
                mid++;
            } 
            else if(nums[mid] ==1){
                mid++;
            }
            else{
                int temp=nums[mid];
                nums[mid]= nums[e];
                nums[e]= temp;

                e--;
            }
        }
        
    }
}