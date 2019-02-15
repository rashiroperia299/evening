//to count the length of the linked list
import java.util.*;
class node
{
	int data;
	node next;
	node head=null;
	public node(int data)
	{
		this.data=data;
		this.next=null;
	}
	public node add(int data)
	{
		node l=new node(data);
		if(head==null)
		{
			head=l;
			head.next=head;
		}
		else
		{
			node temp=head;
			while(temp.next!=head)
			{
				temp=temp.next;
			
			}
			temp.next=l;
			l.next=head;
		}
		return head;
	}
	public void printlist(node head)
	{
		int count=1;
		node temp=head;
		while(temp.next!=head)
		{
			System.out.println(temp.data+"");
			temp=temp.next;
			// temp.next=head;
             count++;
		}
		System.out.println(temp.data);
		
		System.out.println(temp.next.data);
		System.out.println("count= "+count);
	}
}
class node1
{
	public static void main(String []args)
	{     
		Scanner s=new Scanner(System.in);
		node p=new node(-1);
		int n=s.nextInt();
		node h=null;
		int data=0;
		for(int i=0;i<n;i++)
		{
          data=s.nextInt();
          h=p.add(data);
		}
		p.printlist(h);
	}
}