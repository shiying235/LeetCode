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
    public boolean hasPathSum(TreeNode root, int sum) {
        //if(root.val>sum) return false;
        if(root.left==null&&root.right==null){
            if(sum==root.val) return true;
            else return false;
        } 
        // if(root==null)
        //     if(sum==0) return true;
        //     else return false;
        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
    }
}