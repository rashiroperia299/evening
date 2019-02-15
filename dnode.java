import java.util.*;
class node
{
	int data;
    node next;
    node head=null;
    node prev;
    public node(int data)
    {
    	this.data=data;
    	this.next=null;
    	this.prev=null;
    }
    public node add(int data)
    {
    	node l=new node(data);
    	l.next=null;
    	if(head==null)
    	{
    		l.prev=null;
    		head=l;
    	}
    	else
    	{
    		node temp=head;
    		while(temp.next!=null)
    		{
    		
    			temp=temp.next;
                
    		}
    		temp.next=l;
    		l.prev=temp;
    		
    	}
    	return head;
    }
    public void printlist(node head)
    {
             node temp=head;
             while(temp!=null)
             {
             	System.out.print(temp.data+" ");
             	head=temp;
             	temp=temp.next;
             }
             while(head!=null)
             {
             	System.out.print(head.data+" ");
             	head=head.prev;
             }
    }
}
    class dnode1
    {
    	public static void main(String[]args)
    	{
    	node h=null;
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int data=0;
        node p=new node(data);
        for(int i=0;i<a;i++)
        {
        	data=s.nextInt();
        	h=p.add(data);
        }
        p.printlist(h);
    	}
    }
