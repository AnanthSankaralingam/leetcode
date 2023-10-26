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
    public int maxHelper(TreeNode localRoot, int max){
        if(localRoot==null ||(localRoot.left==null && localRoot.right==null)){
            return max;
        }
        max = Math.max(maxHelper(localRoot.left,max+1), maxHelper(localRoot.right, max+1));
        return max;
    }
    public int maxDepth(TreeNode root) {
        if(root == null) 
            return 0;
        return maxHelper(root,1);
    }
}