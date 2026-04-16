class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset= new ArrayList<>();
        helper(0, nums, subset, ans);
        return ans;
    }
    public void helper(int ind, int [] nums, List<Integer>subset, List<List<Integer>>ans){
        if(ind==nums.length){
            ans.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[ind]);
        helper(ind+1, nums, subset, ans);
        subset.remove(subset.size()-1);
        helper(ind+1, nums, subset, ans);
    }
}