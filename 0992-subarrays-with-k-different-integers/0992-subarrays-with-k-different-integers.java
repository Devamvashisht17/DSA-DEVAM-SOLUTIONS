class Solution {
    public int atmost(int nums[], int k){
        int left=0, count=0;
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            while(map.size()>k){
                map.put(nums[left], map.get(nums[left])-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }
            count=count+i-left+1;

        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums, k) - atmost(nums, k-1);
    }
}