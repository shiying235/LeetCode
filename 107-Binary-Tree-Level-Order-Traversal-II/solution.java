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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null){
            return result;
        }
        Queue level = new LinkedList<TreeNode>();
        level.offer(root);
        while (!level.isEmpty()){
            List<Integer> levelResult = new ArrayList<Integer>();
            int size = level.size();
            for (int i = 0; i < size; i++){
                TreeNode node = (TreeNode)level.poll();
                levelResult.add(node.val);
                if (node.left != null){
                    level.offer(node.left);
                }
                if (node.right != null){
                    level.offer(node.right);
                }
            }
            result.add(0,levelResult);
        }
        return result;
    }
}