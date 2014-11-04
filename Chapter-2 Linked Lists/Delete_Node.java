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
public class Delete_Node
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
	public static void main(String[] args)
	{
		   Delete_Node list = new Delete_Node();
		   list.addNode(1);
		   list.addNode(1);
		   list.addNode(1);
		   list.addNode(2);
		   list.addNode(3);
		   list.addNode(2);
		System.out.println("Enter the node number to delete\n");
		Scanner sc = new Scanner(System.in);
		int node = sc.nextInt();
		    list.print();
		LinkedListNode temp = list.head;
		int count = 1;
		while(temp!=null)
		{
			if(count==node)
			{
				list.Delete_Node(temp);
			}
			count++;
			temp=temp.next;
		}
			
	}
	public boolean Delete_Node(LinkedListNode n)
	{
		if(n==null||n.next==null)
		{
			return false;
		}
		LinkedListNode next = n.next;
		n.data = next.data;
		n.next = next.next;
		print();
		return true;
	}
}
