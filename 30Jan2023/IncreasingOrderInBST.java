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
  
    TreeNode res = null;
    TreeNode temp = null;
    public TreeNode increasingBST(TreeNode root) {
       if(root==null)
        return null;    
       increasingBST(root.left);
       if(temp==null){
           temp = new TreeNode(root.val);
           res = temp;
       } 
       else{
          temp.right = new TreeNode(root.val);
          temp =temp.right;  
       }  
       increasingBST(root.right);
     return res;
    }
}
