//balanced binary tree

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
    boolean res = true;
    public boolean isBalanced(TreeNode root) {
        if(root==null)
        return res;
     int ld = depth(root.left);
     int rd = depth(root.right);
     if(Math.abs(ld-rd)<=1 && isBalanced(root.left) && isBalanced(root.right)){
         return res;
     }
    return false;
    }
    public int depth(TreeNode root){
       if(root==null)
        return 0;
     int lh = depth(root.left);
     int rh = depth(root.right);
     return Math.max(lh,rh)+1;
    }
}
