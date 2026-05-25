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
    public int minDiffInBST(TreeNode root) {
        int min= Integer.MAX_VALUE;
        inorder(root, arr);
        for(int i=1;i<arr.size();i++){
            min= Math.min(min, arr.get(i)- arr.get(i-1));
        }
        return min;
    }
    ArrayList<Integer> arr = new ArrayList<>();
    public void inorder(TreeNode root, ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }
}