class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset= new ArrayList<>();

        helper(0, nums, ans, subset);
        return ans;
    }
    public void helper(int ind, int [] nums, List<List<Integer>> ans, List<Integer> subset){
        ans.add(new ArrayList<>(subset));
        for(int i=ind;i<nums.length;i++){
            if(i> ind && nums[i] == nums[i-1]){
                continue;
            }
            subset.add(nums[i]);
            helper(i+1, nums, ans, subset);
            subset.remove(subset.size()-1);
        }
    }
}