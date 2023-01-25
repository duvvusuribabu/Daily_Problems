//Symmetric tree

class Solution {
    public boolean isSymmetric(TreeNode root) {
      return (root==null || symmetric(root.left,root.right));
  }
  public boolean symmetric(TreeNode left ,TreeNode right)
  {
      if(left==null && right==null)
        return true;
        if (left==null || right ==null)
        return false;
       if(left.val != right.val)
         return false;
       return (symmetric(left.left,right.right) && symmetric(left.right ,right.left)); 
  } 
}
