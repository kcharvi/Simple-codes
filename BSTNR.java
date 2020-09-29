import java.util.*;
class Main
{
class Node
  {
    int data;
    Node right=null;
    Node left=null;
  }
  public static Node root=null;
  public boolean find(int id)
  {
		Node current = root;
		while(current!=null)
		{
			if(current.data==id)
			{
				System.out.println(id +" is found");
				return true;
			}
			else if(current.data>id)
			{
				current = current.left;
			}
			else
			{
				current = current.right;
			}
		}
		System.out.println("invalid");
		return true;
	}
	public void insert(int id)
 {
		Node newNode = new Node();
		newNode.data=id;
		if(root==null)
		{
			root=newNode;
			return;
		}
		else 
	   {
		Node current = root;
		Node parent = null;
		while(true)
		{
			parent = current;
			if(id<current.data)
			{				
				current = current.left;
				if(current==null)
				{
					parent.left = newNode;
					return;
				}
			}
			else
			{
				current = current.right;
				if(current==null)
				{
					parent.right = newNode;
					return;
				}
			}
		}
	}
}
  
  public void display(Node root)
  {
      if(root!=null)
      {
          display(root.left);
          System.out.println(root.data+ " ");
          display(root.right);
      }
  }
  public static void main(String[] args)
  {
      Main b=new Main();
      b.insert(56);
      b.insert(65);
      b.insert(35);
      b.insert(45);
      b.find(45);
      b.display(b.root);
  }
}
