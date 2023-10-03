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
 List<Integer> res = new LinkedList<Integer>();

    public void inorder(TreeNode root)
    {
        if(root == null)
        {
            return;
        }

        inorder(root.left);
        res.add(root.val);
        inorder(root.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return res;
    }
 */
class Solution {
    List<Integer> list = new ArrayList<>();
    //use auxillary method so you can add without return value
    public void inorder(TreeNode root)
    {
        if(root == null)
        {
            return;
        }

        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return list;
    }
}