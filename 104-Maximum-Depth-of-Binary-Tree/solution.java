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
    //     if(root == null) return 0;
    //     return maxDepth(root.left)>=maxDepth(root.right)?(1+maxDepth(root.left)):(1+maxDepth(root.right));
        
        //
        if(root == null) return 0; 
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        if(left > right) {
            return 1 + left;
        } else return 1 + right;
        
        // if(root==null){
        //     return 0;
        // }
        // return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}