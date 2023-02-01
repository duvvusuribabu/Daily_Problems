class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> list = new ArrayList<>();
      if(root==null)
        return list;
        
      Queue<Node> queue = new LinkedList<>();
      queue.add(root);
      
      while(!queue.isEmpty()){
          int size = queue.size();
          for(int i=0 ;i<size ;i++){
              
              Node temp = queue.poll();
              if(i==0){
                   list.add(temp.data);
              }
               
              if(temp.left!=null)
                queue.add(temp.left);
              if(temp.right!=null)
                queue.add(temp.right);
          }
      }
      return list;
    }
}
