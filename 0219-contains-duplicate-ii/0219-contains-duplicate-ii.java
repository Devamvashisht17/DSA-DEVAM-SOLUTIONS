class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int dup1=0;
        int dup2=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                dup1=i;
                dup2=map.get(nums[i]);
                if(Math.abs(dup1-dup2)<=k){
                    return true;
                }
                map.put(nums[i],i);
            }
            else{
                map.put(nums[i], i);
            }
        }
        return false;
    }
}