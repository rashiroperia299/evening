//to find round robin of the linked list
import java.util.*;
class node
{     int count=0;
	int data;
	node next;
	node head=null;
	public node(int data,int count)
	{
		this.data=data;
		this.count=count;
		this.next=null;
	}
	public node add(int data,int count)
	{
		node l=new node(data,count);
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
	public node robin(int time, int count)
	{
		//int temp=0;
		node temp=head;
		do
		{
			if(temp.count<time)
			{
				temp.count=0;
			}
			else
			{
				while(temp.count!=0)
				{
				temp.count=temp.count-time;
			}
			}
			temp=temp.next;
		}
		while(temp!=head);
		return head;
	}
	public void printlist(node head)
	{
		
		node temp=head;
		while(temp.next!=head)
		{      int time=0;
			System.out.println("data=" +temp.data +"count=" + temp.count);
			temp=temp.next;
			// temp.next=head;
             count++;
		}
		System.out.println("data=" +temp.data +"count=" + temp.count);
		System.out.println(temp.next.data);

	}
	
}
class node1
{
	public static void main(String []args)
	{
	    int count=3;
		int data=0;
		Scanner s=new Scanner(System.in);
		node p=new node(data,count);
		System.out.println("enter the size of linked list");
		int n=s.nextInt();
		node h=null;
		//int data=0;
		for(int i=0;i<n;i++)
		{
          data=s.nextInt();
          count=s.nextInt();
          h=p.add(data,count);

		}
		int t=s.nextInt();
		h=p.robin(t,count);
		p.printlist(h);
	}
}