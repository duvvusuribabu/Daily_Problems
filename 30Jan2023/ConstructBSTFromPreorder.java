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
    int i = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
       int size = preorder.length;
       if(size==0)
        return null;
        return insert(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);   
    }
    public TreeNode insert(int[] preorder, int min, int max){
        if(i>=preorder.length)
          return null;
        int data = preorder[i];
        TreeNode node = null;
        if(data>min && data<max){
           node = new TreeNode(data);
           i++;
          node.left = insert(preorder, min, data);
          node.right = insert(preorder, data, max); 
        } 
       return node;
    }
}
