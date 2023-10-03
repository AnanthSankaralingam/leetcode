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
    public void invert(TreeNode localRoot){
        if(localRoot == null){ //stopping case
            return;
        }
        TreeNode leftTemp = localRoot.left;
        localRoot.left =  localRoot.right;
        localRoot.right = leftTemp;
        invert(localRoot.left);
        invert(localRoot.right);
    }
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }
}