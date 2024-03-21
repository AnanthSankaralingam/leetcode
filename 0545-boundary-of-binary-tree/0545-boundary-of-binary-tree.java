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
    public void leftBoundary(TreeNode root, List<Integer> list){
        if(root==null || (root.left == null && root.right == null))
            return;
            
        list.add(root.val);
        
        if(root.left != null){
            leftBoundary(root.left, list);
        }else if(root.right != null){
            leftBoundary(root.right, list);
        }
    }
    public void getLeaves(TreeNode root, List<Integer> list){
        if(root==null)
            return;
        if(root.left==null && root.right == null){
            list.add(root.val);
            return;
        }
        getLeaves(root.left, list);
        getLeaves(root.right, list);
    }
    public void rightBoundary(TreeNode root, List<Integer>list){
        if(root==null || (root.left == null && root.right == null))
            return;
        if(root.right != null){
            rightBoundary(root.right, list);
            list.add(root.val);
        }else if(root.left != null){
            rightBoundary(root.left, list);
            list.add(root.val);
        }
    }
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        res.add(root.val);
        if(root.left==null && root.right==null)
            return res;
        leftBoundary(root.left, res);
        getLeaves(root, res);
        rightBoundary(root.right,res);
        return res;
    }
}