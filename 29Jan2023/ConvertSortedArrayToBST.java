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
    public TreeNode sortedArrayToBST(int[] nums) {
      int size = nums.length;
      if(size==0)
       return null;
       return bst(nums, 0, size-1);
    }
    public TreeNode bst(int[] nums,int l, int r)
    {
       if(l>r){
           return null;
       } 
        int mid = l+(r-l)/2;
        TreeNode res = new TreeNode(nums[mid]);
         res.left = bst(nums, l, mid-1);
        res.right = bst(nums, mid+1, r);
        return res;
    }
}
