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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> arr= new ArrayList<>();
        if(root==null){
            return arr;
        }
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        TreeNode curr;

        while(!q.isEmpty()){
            int size=q.size();
            int max= Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                curr=q.remove();
                max= Math.max(max, curr.val);

                if(curr.left !=null){
                    q.add(curr.left);
                }
                if(curr.right !=null){
                    q.add(curr.right);
                }
            }
            arr.add(max);
        }
        return arr;
    }
}