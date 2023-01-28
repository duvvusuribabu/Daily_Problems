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
    int min = Integer.MAX_VALUE;
    TreeNode temp = null;
    public int minDiffInBST(TreeNode root) {
     if(root==null)
       return min;
     minDiffInBST(root.left);
     if(temp!=null){
         min = Math.min(min, root.val-temp.val);
     }
     temp = root;
     minDiffInBST(root.right);
       
    return min;
    }
}
