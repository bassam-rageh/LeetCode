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
    
    List<Integer> traversal;
    
    public List<Integer> preorderTraversal(TreeNode root) {
        traversal = new ArrayList<Integer>();
        dfs(root);
        return traversal;
    }
    
    private void dfs(TreeNode root){
        if(root==null){
            return;
        }
        traversal.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }
}