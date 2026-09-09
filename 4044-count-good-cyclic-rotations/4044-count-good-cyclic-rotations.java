class Solution {
    public int countGoodRotations(int[] nums) {
      int n=nums.length;
      int half=n/2;
      int total=0;
      int count =0;

        for(int i=0;i<n;i++){
            total=total+nums[i];
        }
        int first=0;
        for(int i=0;i<half;i++){
            first=first+nums[i];
        }
        for(int start=0;start<n;start++){
            long second = total-first;

            if(first> second){
                count++;
            }
            first=first-nums[start] + nums[(start+half)%n];
        }
        return count;

    }
}