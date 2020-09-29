import java.util.*;
class node{
    node left, right;
    int data;
}
class Binarytree{
	static Scanner sc=new Scanner(System.in);
	
static node create()
{
        node root=new node();
        System.out.println("enter current node data:");
        root.data=sc.nextInt();
        System.out.println("is there left child to "+root.data);
        char ch;
        ch=sc.next().charAt(0);
        if(ch=='y'||ch=='Y')
        root.left=create();
        else
        root.left=null;
        System.out.println("is there right child to "+root.data);
        ch=sc.next().charAt(0);
        if(ch=='y'||ch=='Y')
        root.right=create();
        else
        root.right=null;
    
    return root;
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
static void preorder(node root)
{
    if(root!=null)
    {
        System.out.print(root.data+"  ");
		preorder(root.left);
        preorder(root.right);
	    
    }
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
public static void main(String args[])
{
    node root;
	root=create();
	System.out.println("\nInorder Sequence");
    inorder(root);
	System.out.println("\nPreorder Squence");
	preorder(root);
	System.out.println("\nPostorder Sequence");
	postorder(root);

}
}