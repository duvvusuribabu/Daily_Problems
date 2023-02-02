/*  
	class Node
		public  int frequency; // the frequency of this tree
    	public  char data;
    	public  Node left, right;
    
*/ 

	void decode(String s, Node root) {
      StringBuffer str = new StringBuffer();
        Node temp = root;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                temp = temp.right;
            }
            else{
                temp = temp.left;
            }
            if(temp!=null && temp.left==null && temp.right==null)
            {
                str.append(temp.data);
                temp = root;
            }
        }
    System.out.println(str.toString());
       
    }
