class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        permute(0, nums, ans);
        return ans;

    }
    private void permute(int ind, int []nums, List<List<Integer>> ans){
        List<Integer>ds= new ArrayList<>();
        if(ind == nums.length){
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);

            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        HashSet<Integer>set = new HashSet<>();

        for(int i=ind;i<nums.length;i++){
            if(set.contains(nums[i])) continue;
            set.add(nums[i]);
            swap(i,ind,nums);
            permute(ind+1,nums,ans);
            swap(i,ind,nums);
        }
    }
     public void swap(int i,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}