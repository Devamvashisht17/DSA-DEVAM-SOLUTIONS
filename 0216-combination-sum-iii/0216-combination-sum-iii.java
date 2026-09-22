class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds= new ArrayList<>();
        sum(1, k, 0, n, ds, ans);
        
        return ans;
    }
    public void sum(int index, int k, int sum, int n, List<Integer> ds, List<List<Integer>>ans){

        if(ds.size()==k){
            if(sum==n){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(index>9 || sum>n){
            return;
        }
        ds.add(index);
        sum(index+1, k, sum+index, n, ds, ans);
        ds.remove(ds.size()-1);
        sum(index+1, k , sum, n, ds, ans);

    }
}