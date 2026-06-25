class Solution {
    public int minimumOperations(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i] !=0){
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            }
        }
        return map.size();
    }
}