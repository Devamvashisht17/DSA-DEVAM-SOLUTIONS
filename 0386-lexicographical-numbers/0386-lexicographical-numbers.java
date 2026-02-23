class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans= new ArrayList<>();
        for(int i=1;i<=9;i++){
            search(i, n, ans);
            
        }
        return ans;
    }
    private void search(int curr, int n, List<Integer> ans){
        if(curr>n){
            return;
        }
        ans.add(curr);
        for(int i=0;i<=9;i++){
            search(curr *10 +i, n, ans);
        }
    }
}