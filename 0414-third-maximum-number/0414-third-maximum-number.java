class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set= new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        ArrayList<Integer> arr= new ArrayList<>();
        for(int num : set){
            arr.add(num);
        }
        if(arr.size()>=3){
            return arr.get(arr.size()-3);

        }
        if(arr.size()==2){
            return arr.get(1);
        }
        if(arr.size()==1){
            return arr.get(0);
        }
        return -1;
    }
}