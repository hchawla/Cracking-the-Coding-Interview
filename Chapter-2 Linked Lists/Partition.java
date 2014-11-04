import java.util.Scanner;
class LinkedListNode
{
	int data;
	LinkedListNode next;
	public LinkedListNode(int d)
	{
		this.data = d;
	}
}
public class Partition
{
	LinkedListNode head;
	public void addNode(int d)
	{
		LinkedListNode n = new LinkedListNode(d);
		if(this.head==null)
		{
			this.head=n;
		}
		else
		{
			LinkedListNode temp = head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
		}
	}
	public void print()
	{
    		LinkedListNode n = head;
    		while(n!=null)
		{
	        	System.out.print(n.data +" ");
	        	n = n.next;
    		}
	}
	public LinkedListNode Partition(int x)
	{
		LinkedListNode beforeStart = null;
		LinkedListNode beforeEnd = null;
		LinkedListNode afterStart = null;
		LinkedListNode afterEnd = null;
		LinkedListNode temp = head;
		while(temp!=null)
		{
			LinkedListNode next = temp.next;
			temp.next = null;
			if(temp.data<x)
			{
				if(beforeStart==null)
				{
					beforeStart = temp;
					beforeEnd=beforeStart;
				}
				else
				{
					beforeEnd.next = temp;
					beforeEnd=temp;
				}
			}
			else
			{
				if(afterStart==null)
				{
					afterStart = temp;
					afterEnd=afterStart;
				}
				else
				{
					afterEnd.next = temp;
					afterEnd=temp;
				}
			}
			temp=next;
		}
		if(beforeStart==null)
		{
			return afterStart;
		}
		beforeEnd.next= afterStart;
		return beforeStart;
		
	}
	public static void main(String[] args)
	{
		    Partition list = new Partition();
		    list.addNode(10);
		    list.addNode(1);
		    list.addNode(5);
		    list.addNode(100);
		    list.addNode(2);
		    list.addNode(90);


		    list.print();
		list.head=list.Partition(4);
		list.print();
	}
}
