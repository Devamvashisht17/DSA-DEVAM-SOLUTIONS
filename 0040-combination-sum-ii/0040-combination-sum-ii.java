class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds= new ArrayList<>();
        Arrays.sort(candidates);
        combinations(0, candidates, target, ans, ds);
        return ans;
    }
    public void combinations(int ind, int [] candidates, int target, List<List<Integer>> ans, List<Integer> ds){
        if(target ==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<candidates.length;i++){
            if(i > ind && candidates[i] == candidates[i-1]){
                continue;
            }
            if(candidates[i] > target) {  // to optimise -> as arr is sorted so if ele becomes goes greater than target loop wont go ahead
                break; 
            }
            ds.add(candidates[i]);
            combinations(i+1, candidates, target - candidates[i], ans, ds);
            ds.remove(ds.size()-1);
        }
    }
}