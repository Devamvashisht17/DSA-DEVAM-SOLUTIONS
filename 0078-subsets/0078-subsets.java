class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> subset= new ArrayList<>();

        helper(0, nums, ans,subset);
        return ans;
    }
    public void helper(int ind, int[] nums, List<List<Integer>> ans, List<Integer> subset){
        if(ind ==  nums.length){
            ans.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[ind]);
        helper(ind+1, nums, ans, subset);
        subset.remove(subset.size()-1);
        helper(ind+1, nums, ans, subset);

    }
}