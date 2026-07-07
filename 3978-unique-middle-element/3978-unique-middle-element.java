class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n= nums[nums.length/2];
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        if(map.get(n)==1){
            return true;
        }
        return false;
    }

}