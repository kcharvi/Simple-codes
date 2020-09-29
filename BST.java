import java.util.*;
class node{
    node left, right;
    int data;
}
class BST{
	static Scanner sc=new Scanner(System.in);
	static boolean search(node r,int key)
	{
		if(r==null)
			return false;
		else if(key==r.data)
			return true;
		else if(key<r.data)
			return search(r.left,key);
		else
			return search(r.right,key);
	}
		
		
	static node insert(node r,int key)
	{
		if(r==null)
		{
			r=new node();
			r.data=key;
			r.left=r.right=null;
			return r;
		}
		else if(key<r.data)
			r.left=insert(r.left,key);
		else
			r.right=insert(r.right,key);
	    return r;
	}
	static void postorder(node root)
	{
		if(root!=null)
		{
        
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+"  ");
        }
	}
	static void inorder(node root)
	{
		if(root!=null)
		{
			inorder(root.left);
			System.out.print(root.data+"  ");
			inorder(root.right);
        }
	}
	static int max(node r)
	{
		while(r.right!=null)
			r=r.right;
		return r.data;
	}
	static node Delete(node r,int key)
	{   
		if(r==null)
			return null;
		else if(key<r.data)
			r.left=Delete(r.left,key);
		else if(key>r.data)
			r.right=Delete(r.right,key);
		else
		{
			if(r.left==null)
				return r.right;
			else if(r.right==null)
				return r.left;
			else
			{
				node t=r.left;
				while(t.right!=null)
				t=t.right;
				r.data=t.data;
				r.left=Delete(r.left,r.data);
			}
		}
		return r;
	}
		
	public static void main(String args[])
	{
    node root=null;
	
	int op;
	while(true)
	{
		System.out.println("1. Insert\n2. Delete\n3. Search\n4. Exit");
		op=sc.nextInt();
		switch(op)
		{
			case 1: System.out.println("Enter Key to insert:");
					root=insert(root,sc.nextInt());
					inorder(root);
					System.out.println();
					break;
			case 2: System.out.println("Enter Key to Delete:");
					root=Delete(root,sc.nextInt());
					inorder(root);
					System.out.println();
					break;
			case 3: if(search(root,sc.nextInt()))
					System.out.println("Found");
					else
					System.out.println("Not Found");
					break;
			case 4:System.exit(0);
					break;
			default: System.out.println("Invalid choice");
					break;
		}
	}
	
    postorder(root);
	}
}