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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       List<List<Integer>> llist = new ArrayList<>();
       if(root==null)
         return llist;
       Queue<TreeNode> queue = new LinkedList<>();
       List<Integer> list = new ArrayList<>();
       queue.add(root);
       while(!queue.isEmpty())
       {
           list = new ArrayList<>();
           int size = queue.size();
          for(int i=0 ;i<size ;i++)
          {
             TreeNode curr = queue.poll();
             list.add(curr.val);
             if(curr.left!=null)
               queue.add(curr.left);
             if(curr.right!=null)
               queue.add(curr.right);  
          }  
          llist.add(list); 
       }
       int len = llist.size();
        for(int i=1 ;i<len ;i=i+2)
        {
           Collections.reverse(llist.get(i));
        }
       return llist;   
    }
}
