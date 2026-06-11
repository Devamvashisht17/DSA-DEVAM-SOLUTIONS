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
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> q= new LinkedList<>();
        ArrayList<Long> arr= new ArrayList<>();

        q.offer(root);
        while(!q.isEmpty()){
            int size= q.size();
            long sum=0;
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                sum=sum+node.val;
                
                if(node.left !=null){
                    q.offer(node.left);
                }
                if(node.right !=null){
                    q.offer(node.right);
                }
            }
            arr.add(sum);
        }
        Collections.sort(arr);
        if(arr.size()<k)
        return -1;
        return arr.get(arr.size()-k);
    }
}