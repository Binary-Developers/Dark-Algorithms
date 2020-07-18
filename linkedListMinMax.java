import java.util.Scanner;



public class linkedListMinMax {
static Node head;
class Node{
	public int data;
	public Node next;
	Node(int data){
		this.data=data;
	}
}

void add(int data)
{   Node ctr=head;
	Node ptr = new Node(data);
	if(ctr==null)
	{
		head=ptr;
		ptr.next=null;
	}
	else 
	{
		
		while(ctr.next!=null)
			ctr=ctr.next;
		ctr.next=ptr;
		ptr.next=null;
	}
}

public void print() {
	Node ctr=head;
	

	
	while(ctr!=null)
	{
		System.out.print(ctr.data+" ");
		ctr=ctr.next;
	}
	
	
	
}

public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	linkedListMinMax ll = new linkedListMinMax();
	String choice;int data; 
	
	System.out.println("Enter y to add a data to Linked List");
	
	choice = sc.nextLine();
		while(!choice.isEmpty() && choice.charAt(0)=='y') {
			
		
		System.out.println("Enter data to enter into the linked list");
		data=sc.nextInt();
		ll.add(data);
		ll.print();
		System.out.println();
System.out.println("Enter y to add a data to Linked List");
		sc.nextLine();
		choice = sc.nextLine();
	}
	Node ctr=head;
	if(ctr==null)
		System.out.println("Linked List is empty");
	else {
	int min,max;
	min=head.data;
	max=head.data;
	while(ctr!=null)
	{
		if(ctr.data<min)
			min=ctr.data;
		if(ctr.data>max)
			max=ctr.data;
		ctr=ctr.next;
		
	}
	System.out.println("Min element is"+min);
	System.out.println("Max element is"+max);
}
}
}