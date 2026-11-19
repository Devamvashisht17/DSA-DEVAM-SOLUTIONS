/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds= new ArrayList<>();
        helper(root, 0, targetSum, ds, ans);
        return ans;
    }
    public void helper(TreeNode root, int sum, int targetSum, List<Integer> ds, List<List<Integer>> ans){
        if(root== null){
            return;
        }
        sum+= root.val;
        ds.add(root.val);

        if(root.left== null && root.right == null){
            
            if(sum== targetSum){
                ans.add(new ArrayList<>(ds));
            }
            ds.remove(ds.size()-1);
            return;
        }
        helper(root.left, sum, targetSum,ds, ans);
        helper(root.right, sum, targetSum, ds, ans);
        ds.remove(ds.size()-1);

    }
}