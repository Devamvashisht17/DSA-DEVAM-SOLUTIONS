class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int x: nums){
            set.add(x);
        }
        int max= Arrays.stream(nums).max().getAsInt();
        for(int i=1;i<=max;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        if(max<0){
            return 1;
        }
        return max+1;
    }
}