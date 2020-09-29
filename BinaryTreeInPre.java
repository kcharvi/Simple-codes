import java.util.*;
class Node{
    Node left, right;
    int data;
}
class BinaryTreeInPre{
	
	
static int i=0;	
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
static int Find(int in[],int key,int s,int e)
{
	for (int j=s;j<=e;j++)
		if(in[j]==key)
			return j;
   return 0;
}
static Node build(int in[],int pre[], int s,int e)
{
	
	if(e<s)
		return null;
	if(e==s)
	{
		Node c=new Node();
		c.data=pre[i++];
		c.left=c.right=null;
		return c;
	}
	
	
	 	Node c=new Node();
		c.data=pre[i++];
		int q=Find(in, pre[i-1],s,e);
		c.left=build(in,pre,s,q-1);
		c.right=build(in,pre,q+1,e);
	
		return c;
	
        
}
public static void main(String args[])
{
	 Scanner sc=new Scanner(System.in);
	int in[]=new int[10];
	int pre[]=new int[10];
	int n=sc.nextInt();
	for(int j=0;j<n;j++)
		in[j]=sc.nextInt();
		for(int j=0;j<n;j++)
		pre[j]=sc.nextInt();
	Node root=build(in,pre,0,n-1);


	System.out.println("\nInorder Sequence");
    inorder(root);
	System.out.println("\nPreorder Squence");
	preorder(root);
	System.out.println("\nPostorder Sequence");
	postorder(root);

}
}