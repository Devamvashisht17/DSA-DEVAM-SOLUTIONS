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
        Queue<TreeNode> q= new LinkedList<>();
        List<Double> arr= new ArrayList<>();
        q.add(root);

        TreeNode curr;
        while(!q.isEmpty()){
           
            int size= q.size();
            double sum=0;

            int count=0;

            for(int i=0;i<size;i++){
                curr= q.remove();
                sum= sum+ curr.val;
                count++;
                if(curr.left !=null){
                    q.add(curr.left);
                }
                if(curr.right !=null){
                    q.add(curr.right);
                }

            }
            arr.add((double)(sum/count));
        }
        return arr;
    }
}