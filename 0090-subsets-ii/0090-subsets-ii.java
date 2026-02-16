class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> subsets = new ArrayList<>();
        helper(0, nums, subsets, ans);
        return ans;
    }
    private void helper(int ind, int [] nums, List<Integer> subsets, List<List<Integer>> ans){
        ans.add(new ArrayList<>(subsets));
        for(int i=ind;i<nums.length;i++){
            if(i> ind && nums[i] == nums[i-1]) continue;
        

        subsets.add(nums[i]);
        helper(i+1, nums, subsets, ans);
        subsets.remove(subsets.size()-1);
        // helper(i+1, nums, subsets, ans);
        }
    }
}