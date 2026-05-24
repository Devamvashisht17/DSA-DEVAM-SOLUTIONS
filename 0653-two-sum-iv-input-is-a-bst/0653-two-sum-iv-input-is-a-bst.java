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
    public boolean findTarget(TreeNode root, int k) {
        java.util.List<Integer> inorder= new java.util.ArrayList<>();

        inorderTraversal(root, inorder);

        int left= 0;
        int right= inorder.size()-1;

        while(left < right){
            int sum=  inorder.get(left) + inorder.get(right);

            if(sum==k){
                return true;
            }
            else if(sum <k){
                left++;
            }
            else{
                right--;
            }
        }
        return false;

    }
    private void inorderTraversal(TreeNode root, java.util.List<Integer>inorder){

        if(root==null){
            return;
        }
        inorderTraversal(root.left, inorder);
        inorder.add(root.val);
        inorderTraversal(root.right, inorder);
    }
}