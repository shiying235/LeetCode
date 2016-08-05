/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        Queue level = new LinkedList<TreeNode>();
        level.offer(root);
        int depth = 1;
        while (!level.isEmpty()){
            int size = level.size();
            for (int i = 0; i < size; i++){
                TreeNode node = (TreeNode)level.remove();
                if (node.left == null && node.right == null){
                    return depth;
                }
                if (node.left != null){
                    level.offer(node.left);
                }
                if (node.right != null){
                    level.offer(node.right);
                }
            }
            depth++;
        }
        return depth;
    }
}