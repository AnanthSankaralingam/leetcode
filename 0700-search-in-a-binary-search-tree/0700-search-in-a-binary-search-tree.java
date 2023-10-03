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
    public TreeNode searchHelper(TreeNode root, int val){
        if(root==null){
            return null; //stopping case
        }
        if(val < root.val){
            return searchHelper(root.left,val);
        }else if(val > root.val){
            return searchHelper(root.right,val);
        }
        return root;
    }
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode result = searchHelper(root, val);
        return result;
    }
}