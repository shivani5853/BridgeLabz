package Practice;

public class DoublyLinkedList<T> {
	
	Node<T> head;
	Node<T> tail;
	
	class Node<T>
	{
		T data;
		Node<T> next;
		Node<T> prev;
		
		
		Node(T data)
		{
			this.data=data;
		}
	}
	
	/*
	 * Adding the data  
	 */
	public void insert(T data)
	{
		Node<T> new_Node=new Node<T>(data);
		if(head==null)
		{
			head=tail=new_Node;
			head.prev=null;
			tail.next=null;
			return;
		}
		else
		{
		tail.next=new_Node;
		tail=tail.next;
		tail.next=null;
		tail.prev=head.next;
		}
	}
	
	/*
	 * Insert at the front
	 */
	public void insertFront(T data)
	{
		Node<T> new_Node=new Node<T>(data);
		if(head==null&&tail==null)
		{
			head=tail=new_Node;
			head.prev=null;
			tail.next=null;
			return;
		}
		else
		{
			new_Node.next=head;
			new_Node.prev=null;
			if(head!=null)
				head.prev=new_Node;
			head=new_Node;
		}
	}
	
	/*
	 * Insert at the last
	 */
	public void insertLast(T data)
	{
		Node<T> new_Node=new Node<T>(data);
		if(head==null&&tail==null)
		{
			head=new_Node;
			tail=new_Node;
			head.prev=null;
			tail.next=null;
		}
		else
		{
			Node<T> temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=new_Node;
			new_Node.next=null;
			
		}
	}
	
	/*
	 * Delete at First
	 */
	public void deletFirst()
	{
		if(head==null&&tail==null)
		{
			System.out.println("data not present");
			return;
		}
		else
		{
			Node<T> temp=head;
			head=head.next;
			
		}
		
	}
	
//	/*
//	 * Delete at specfic data
//	 */
//	public void deleteSpData(T data)
//	{
//		Node<T> new_Node=new Node<T>(data);
//		if(head==null&&tail==null)
//		{
//			System.out.println("Data Not present");
//			return;
//		}
//		else
//		{
//			Node<T> temp=head;
//				Node<T> fast=temp;
//				Node<T> slow=temp;
//				while(fast.next!=null&&slow!=null)
//				{
//				if(fast.data.equals(data))
//				{
//					fast=fast.next;
//					fast.next=slow.next;
//					return;
//				}
//				fast=fast.next;
//			}
//		}
	
	/*
	 * Delete At last
	 */
	public void deleteLast()
	{
		if(head==null&&tail==null)
		{
			System.out.println("Data not present");
			return;
		}
		else
		{
			Node<T> temp=head;
			while(temp.next==null)
			{
				temp.prev.next=null;
				temp=null;
				temp.prev=null;
				return;
			}
		}
	
	
	}
	/*
	 * Display 
	 */
	public void display()
	{
		Node<T> temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		DoublyLinkedList<Integer> list=new DoublyLinkedList<Integer>();
		list.insert(20);
		list.insert(40);
		list.insert(60);
		list.insert(80);
		list.display();
		
		System.out.println("insert at front");
		list.insertFront(10);
		list.display();
		
		System.out.println("insert at Last");
		list.insertLast(100);
		list.insertLast(110);
		list.display();
		
		System.out.println("Delete at front");
		list.deletFirst();
		list.display();
		
//		System.out.println("Delete at mid");
//		list.deleteSpData(80);
//		list.display();
		
		System.out.println("Delete at Last");
		list.deleteLast();
		list.display();
		
	}
}
