class Solution {
    public int[] rearrangeArray(int[] nums) {
        TreeMap<Integer, Integer> map= new TreeMap<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int [] ans = new int[nums.length];

        int index=0;

        while(index < nums.length){
            for(int num: map.keySet()){
                if(map.get(num)>0){
                    ans[index]=num;
                    index++;

                    map.put(num, map.get(num)-1);
                }
            }
        }
        return ans;
    }
}