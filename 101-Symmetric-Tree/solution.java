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
    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        Queue level = new LinkedList<TreeNode>();
        level.offer(root);
        int times = 0;
        while (!level.isEmpty()){
            ArrayList<TreeNode> treeList = new ArrayList<TreeNode>();
            int size = level.size();
            for (int i = 0; i < size; i++){
                TreeNode node = (TreeNode)level.poll();
                if (node.left != null){
                    level.offer(node.left);
                }
                if (node.right != null){
                    level.offer(node.right);
                }
                treeList.add(node.left);
                treeList.add(node.right);
            }
            int p = 0;
            int q = treeList.size() - 1;
            while (p < q){
                TreeNode head = treeList.get(p);
                TreeNode tail = treeList.get(q);
                if ((head == null && tail != null) || (head != null && tail == null)){
                    return false;
                }else if(head != null && tail != null && head.val != tail.val){
                    return false;
                }
                p++;
                q--;
            }
        }
        return true;
    }
}