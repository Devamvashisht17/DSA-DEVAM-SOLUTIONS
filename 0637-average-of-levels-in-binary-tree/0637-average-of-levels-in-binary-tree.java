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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list= new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();

        if(root == null){
            return list;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int count=0;
            double sum=0;

            int size= q.size();
            for(int i=0;i<size;i++){
            TreeNode node= q.remove();
            sum=sum+ node.val;
            count++;

            if(node.left != null){
                q.offer(node.left);
            }
            if(node.right !=null){
                q.offer(node.right);
            }
            }
        list.add((double)(sum/count));
        }
        
        return list;
    }
}