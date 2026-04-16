class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> subset= new ArrayList<>();
        helper(0, nums, subset, ans);
        return ans;
    }
    public void helper(int ind, int [] nums,List<Integer> subset, List<List<Integer>>ans){
        ans.add(new ArrayList<>(subset));
        for(int i=ind;i<nums.length;i++){
            if(i>ind && nums[i] == nums[i-1]){
                continue;
            }
            subset.add(nums[i]);
            helper(i+1, nums, subset, ans);
            subset.remove(subset.size()-1);
        }
    }
}