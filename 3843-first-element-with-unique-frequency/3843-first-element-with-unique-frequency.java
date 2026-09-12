class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer, Integer> map1 = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map1.containsKey(nums[i])){
                map1.put(nums[i], map1.get(nums[i])+1);
            }
            else{
                map1.put(nums[i],1);
            }
        }
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for(int value: map1.values()){
            if(map2.containsKey(value)){
                map2.put(value, map2.get(value) +1);
            }
            else{
                map2.put(value,1);
            }
        }
        for(int x:nums){
            if(map2.get(map1.get(x))==1){
                return x;
            }
        }
        return -1;
    }
}