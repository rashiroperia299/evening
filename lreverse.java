import java.util.*;
class linkreverse
{
	static Node head;
	static class Node
	  {
    int data;
    Node next;
    Node(int data1)
    {
    	data=data1;
    	next=null;
    }
      }
//to reverse the linked list
Node reverse(Node node)
{
Node prev=null;
Node current =node;
Node next=null;
while(current!=null)
{
	next=current.next;
	current.next=prev;
	prev=current;
	current=next;
}
node=prev;
return node;
}
//to print the content
void printList(Node node)
{
	while(node!=null)
	{
		System.out.println(node.data);
		node=node.next;
	}
}
}
class node1
{
	public static void main(String[]args)
	{
		LinkedList l=new LinkedList();
		l.head=new Node(6);
		l.head.next=new Node(7);
		l.head.next.next=new Node(8);
		l.printList(head);
		head=l.reverse(head);
        l.printList(head);


	}
}