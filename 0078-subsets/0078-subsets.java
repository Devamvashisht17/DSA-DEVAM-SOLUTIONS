class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> subsets= new ArrayList<>();
        helper(0, nums, subsets, ans);
        return ans;
    }
    private void helper(int ind, int []nums, List<Integer> subsets, List<List<Integer>> ans){
        if(ind == nums.length){
            ans.add(new ArrayList<>(subsets));
            return;
        }
        subsets.add(nums[ind]);
        helper(ind+1, nums, subsets, ans);
        subsets.remove(subsets.size()-1);
        helper(ind+1, nums, subsets, ans);

    }

}