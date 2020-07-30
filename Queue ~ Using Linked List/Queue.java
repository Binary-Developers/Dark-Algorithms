import java.util.*;
public class Queue {
	static Node front;
	static Node rear;
	class Node{
		public int data;
		public Node next;
		Node(int data){
			this.data=data;
		}
	}
	void add(int data){
		Node ptr = new Node(data);
		Node ctr=rear;
		if(ctr == null || front == null)
		{
			front = ptr;
			
			ctr = ptr;
		}
		else {
			ctr.next=ptr;
			ctr = ptr;
		}
		rear = ctr;
		ptr.next=null;
		
		
	}
    void remove() {
    	Node ctr=front;int data;
    	if(ctr==null)
    		System.out.println("Queue is empty.");
    	else {
    		data=ctr.data;
    		System.out.println("Removed data is " + data);
    		ctr=ctr.next;
    		front = ctr;
    	}
    }
    
    void print() {
    	Node ctr=front;
    	while(ctr!=null)
    	{
    		System.out.println(ctr.data+" ");
    		ctr=ctr.next;
    	}
    	
    }
	
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	Queue q = new Queue();
    	
    	int choice; boolean f=true;
    	while(f){
    		System.out.println("Enter 1 to input data and 2 to delete data from Queue");
    		choice=sc.nextInt();
    		switch(choice) {
    		case 1: System.out.println("Enter data to enter into Queue");
    		        int data = sc.nextInt();
    		        q.add(data);
    		        q.print();
    		        System.out.println();
    		        break;
    		case 2: q.remove();
    		        q.print();
    		        System.out.println();
    			    break;
    	   default: f=false;
    	            break;
    		}
    	}
    	
    }
    
	
}
