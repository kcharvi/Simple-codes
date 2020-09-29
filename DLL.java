import java.util.*;
class Node{
int data;
Node next,prev;
Node(int d)
{
	data=d;
	next=null;
	prev=null;
}
	
}
class DLL{
	static Node head=null,tail=null;// head and tail are class variables and are accessible in all the methods
	static Scanner sc=new Scanner(System.in);//sc can be used any where in SLL class
	static void create()
	{
		
		System.out.println("Enter total number of nodes");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter data");
		Node temp=new Node(sc.nextInt());
		if(head==null)
			head=tail=temp;
		else{
			tail.next=temp;
			temp.prev=tail;
			tail=temp;
			}
		}
	}
	static void display_fwd()
	{
		if(head==null)
			System.out.println("List is Empty");
		else 
		{
		Node temp;
		temp=head;
		while(temp!=null)
			{
				System.out.print(temp.data+"  ");
				temp=temp.next;
			}
			System.out.println();
		}
	}
	static void display_bwd()
	{
		if(head==null)
			System.out.println("List is Empty");
		else 
		{
		Node temp=tail;
		while(temp!=null)
			{
				System.out.print(temp.data+"  ");
				temp=temp.prev;
			}
			System.out.println();
		}
	}
		
	static void Ins_Begin()
	{
		System.out.println("Enter data");
		Node temp=new Node(sc.nextInt());
		if(head==null)
			head=tail=temp;
		else
		{
			temp.next=head;
			head.prev=temp;
			head=temp;
		}
	}
	static void Ins_End()
	{
		System.out.println("Enter data");
		Node temp=new Node(sc.nextInt());
		if(head==null)
			head=tail=temp;
		else
		{
			tail.next=temp;
			temp.prev=tail;
			tail=temp;
		}
	}
	static void Ins_Pos(int p)
	{
		Node c=head;
		int count=1;
		while(c!=null)
		{
			if(count==p-1)
				break;
			c=c.next;
			count++;
		}
		if(c!=null)
		{
			System.out.println("Enter data");
			Node temp=new Node(sc.nextInt());
			temp.next=c.next;     //four links have to update
			if(c.next!=null)  //if pos is the last node then no next node exist
			c.next.prev=temp;
			c.next=temp;
			temp.prev=c;
			if(c==tail)
				tail=temp;
		}
		else
		{
			System.out.println("Invalid position");
		}
	}
	static void Delete_head()
	{
		Node temp=head;
		if(head==tail) //maybe list is empty or one node
			head=tail=null;
		else
		{
			head=head.next;
			head.prev=null;
			temp.next=null;
			temp=null;
		}

	
		
	}
	static void Delete_Pos(int pos)
	{
		Node c=head,p=null;
		int count=1;
		while(c!=null)
		{
			if(count==pos)
				break;
			p=c;
			c=c.next;
			count++;
		}
		if(c!=null)
		{
			if(head==tail)
			head=tail=null;
		    else
			{
			p.next=c.next;
			if(c.next!=null)
			c.next.prev=p;
			if(c==tail)   //if it is last positioned element
			tail=p;
			c.prev=null;
			c.next=null;
			c=null;
			}
		}
		else
		{
			System.out.println("Invalid position");
		}
	}
	static void Delete_tail()
	{
		Node temp=tail;
		if(head==tail)
			head=tail=temp=null;
		else 
		{
			
			tail=tail.prev; //making last but one node as tail
			tail.next=null;   // deleting a node by removing all references to existing last node
			temp.prev=null;
			temp=null;
		}
			
		
	}		
	
public static void main(String args[]){	
	
	create();
	display_fwd();
	int ch,p;
	while(true)
	{
		System.out.println("Enter choice \n 1.Insert at Begining \n 2. Insert at Pos\n 3. Insert at End \n 4. Delete Head \n 5. Delete Specified pos Node \n 6. Delete Tail \n 7. Display in Reverse\n 8. Exit");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1: Ins_Begin();
					display_fwd();
					break;
			case 2: System.out.println("Enter position of new element");
					p=sc.nextInt();
					Ins_Pos(p);
					display_fwd();
					break;
			case 3: Ins_End();
					display_fwd();
					break;
			case 4: Delete_head();
					display_fwd();
					break;
			case 5: System.out.println("Enter position of element to be deleted");
					p=sc.nextInt();
					Delete_Pos(p);
					display_fwd();
					break;
			case 6: Delete_tail();
					display_fwd();
					break;
			case 7: display_bwd();
					break;
			case 8: System.exit(0);
					break;
			default: System.out.println("Invalid choice");
					break;
		}
	}
}
}
