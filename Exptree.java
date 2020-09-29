import java.util.*;
class Node{
    Node left, right;
    char data;
}
class Exptree{
	static Node s[]=new Node[10];
	static int top=-1;
	static Node pop()
	{
		top--;
		return s[top+1];
	}
	static void push(Node c)
	{
		top++;
		s[top]=c;
	}
	static Scanner sc=new Scanner(System.in);
	
static void inorder(Node root)
{
    if(root!=null)
    {
        inorder(root.left);
        System.out.print(root.data+"  ");
        inorder(root.right);
        
    }
}
static void preorder(Node root)
{
    if(root!=null)
    {
        System.out.print(root.data+"  ");
		preorder(root.left);
        preorder(root.right);
	    
    }
}
static void postorder(Node root)
{
    if(root!=null)
    {
        
		postorder(root.left);
        postorder(root.right);
		System.out.print(root.data+"  ");
        
        
    }
}
public static void main(String args[])
{
	String s1;
	s1=sc.nextLine();
	for(int i=0;i<s1.length();i++)
	{
		
		char t=s1.charAt(i);
		Node c=new Node();
			c.data=t;
		if(t=='+'||t=='-'||t=='^'||t=='*'||t=='/'||t=='%')
		{
			c.right=pop();
			c.left=pop();
		}
		else
			c.left=c.right=null;
		push(c);
	}
	Node root=pop();

	System.out.println("\nInorder Sequence");
    inorder(root);
	System.out.println("\nPreorder Squence");
	preorder(root);
	System.out.println("\nPostorder Sequence");
	postorder(root);

}
}