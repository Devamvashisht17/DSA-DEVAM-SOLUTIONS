/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;0
 
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
        List<List<Integer>> result= new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        boolean leftToRight= true;

        if(root==null){
            return result;
        }
        q.add(root);

        while(!q.isEmpty()){
            List<Integer> list= new ArrayList<>();
            int size=q.size();

            while(size>0){
                TreeNode curr= q.remove();

                list.add(curr.val);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);

                }
                size--;
            }
            if(!leftToRight){
                Collections.reverse(list);
            }
            result.add(list);
            leftToRight=!leftToRight;
        }
        return result;
    }
}