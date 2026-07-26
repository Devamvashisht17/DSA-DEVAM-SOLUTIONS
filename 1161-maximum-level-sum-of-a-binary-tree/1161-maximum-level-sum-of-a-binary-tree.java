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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        int level=1;
        int max=Integer.MIN_VALUE;
        int ans=1;
        while(!q.isEmpty()){
            int size=q.size();
            int sum=0;
            for(int i=0;i<size;i++){
                TreeNode node= q.poll();
                sum=sum+node.val;

                if(node.left !=null){
                    q.offer(node.left);
                }
                if(node.right !=null){
                    q.offer(node.right);
                }
            }
            if(sum>max){
                max=sum;
                ans= level;
            }
            level++;
        }
        return ans;
    }
}