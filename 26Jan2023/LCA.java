 //Lowest Common Ancestor of a Binary Tree
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      if(root==null)
        return null;
      if(root==p || root==q)
        return root;  
      TreeNode ln =  lowestCommonAncestor(root.left,p,q);
      TreeNode rn =  lowestCommonAncestor(root.right,p,q);
      if(ln!=null && rn!=null)
        return root;
      if(ln!=null)
        return ln;
      if(rn!=null)
        return rn;
      return null;        
    }
}
