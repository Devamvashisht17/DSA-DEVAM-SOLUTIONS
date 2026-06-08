class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int length=0;
        for(int num: set){
        if(!set.contains(num-1)){
            int curr=num;
            int count=1;

            while(set.contains(curr+1)){
                curr++;
                count++;
            }
            length= Math.max(length, count);
        }
        }
        return length;
    }
}