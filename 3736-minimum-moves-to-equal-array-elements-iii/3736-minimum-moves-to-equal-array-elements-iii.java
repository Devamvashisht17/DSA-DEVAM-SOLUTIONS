class Solution {
    public int minMoves(int[] nums) {
        int n= nums.length;
        int max=nums[0];

        for(int i=0;i<n;i++){
            if(nums[i] > max){
                max= nums[i];
            }
        }
        int move=0;
        
        for(int i=0;i<n;i++){
            move+=max-nums[i];
        }
        return move;
    }

}