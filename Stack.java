import java.util.*;
public class Stack {
static Node top;
class Node{
	public int data;
	public Node next;
	Node(int data){
		this.data=data;
	}
}

void push(int data)
{
	Node ptr = new Node(data);
	if(top==null)
	{
		top=ptr;
		ptr.next=null;
	}
	else 
	{
		Node ctr=top;
		while(ctr.next!=null)
			ctr=ctr.next;
		ctr.next=ptr;
		ptr.next=null;
	}
}

void pop(){
	Node ctr=top;int d;
	if(ctr==null)
		{System.out.println("Stack is empty");
		return ;
		}
	else if(ctr.next==null)
	{   
		d=ctr.data;
		System.out.println("Deleted data is "+d);
		top = null;
		return ;
	}
	while(ctr.next.next!=null)
		ctr=ctr.next;
	d=ctr.next.data;
	System.out.println("Deleted data is "+d);
	ctr.next=null;
	
}

void print()
{
	Node ctr=top;
	while(ctr!=null)
	{
		System.out.print(ctr.data+" ");
		ctr=ctr.next;
	}
}

public static void main(String[] args)
{
	Stack st=new Stack();
	Scanner sc=new Scanner(System.in);
	int choice; boolean f=true;
	while(f) {
		System.out.println("Enter 1 to input data and 2 to delete data from stack");
		choice=sc.nextInt();
		switch(choice) {
		case 1: System.out.println("Enter data to enter into stack");
		        int data = sc.nextInt();
		        st.push(data);
		        st.print();
		        System.out.println();
		        break;
		case 2: st.pop();
		        st.print();
		        System.out.println();
			    break;
	   default: f=false;
	            break;
		}
	}
}

}

/*Enter 1 to input data and 2 to delete data from stack
1
Enter data to enter into stack

5
5 
Enter 1 to input data and 2 to delete data from stack
2
Deleted data is 5

Enter 1 to input data and 2 to delete data from stack
2
Stack is empty

Enter 1 to input data and 2 to delete data from stack
1
Enter data to enter into stack
6
6 
Enter 1 to input data and 2 to delete data from stack
1
Enter data to enter into stack
4
6 4 
Enter 1 to input data and 2 to delete data from stack
2
Deleted data is 4
6 
Enter 1 to input data and 2 to delete data from stack
*/
