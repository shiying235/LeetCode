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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
      //  if(root.left==null&&root.right==null) return 1;
        return maxDepth(root.left)>maxDepth(root.right)?(1+maxDepth(root.left)):(1+maxDepth(root.right));
    }
}