import java.util.Scanner;
public class kth
{
	LinkedListNode head;
	int k;
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
	public void find_Kth()
	{
		System.out.println("Enter the value of K");
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		int count=0;
		LinkedListNode temp = head;
		while(temp!=null)
		{
			temp = temp.next;
			count++;
		}
		temp = head;
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			if(i<count-k)
			{
				temp=temp.next;
				System.out.println("Hello");
			}
			if(i>=count-k)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
			
		}
	}
	public static void main(String[] args)
	{
		    kth list = new kth();
		    list.addNode(1);
		    list.addNode(1);
		    list.addNode(1);
		    list.addNode(2);
		    list.addNode(3);
		    list.addNode(2);

		    list.print();
			list.find_Kth();
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
}
class LinkedListNode
{
	int data;
	LinkedListNode next;
	public LinkedListNode(int d)
	{
		this.data = d;
	}
}
