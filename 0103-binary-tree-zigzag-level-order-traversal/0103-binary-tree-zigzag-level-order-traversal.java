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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list= new ArrayList<>();

        Queue<TreeNode> q= new LinkedList<>();

        if(root==null){
            return list;
        }
        
        q.offer(root);
        int count=0;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> level= new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node = q.remove();
                level.add(node.val);
                
                if(node.left != null){
                    q.offer(node.left);

                }
                if(node.right !=null){
                    q.offer(node.right);
                }
            }
            if(count %2==1){
                Collections.reverse(level);
            }
            list.add(level);
            count++;
        }
        return list;
    }
}