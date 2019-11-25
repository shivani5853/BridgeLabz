/******************************************************************************

 *  Purpose: Linked List Implementation
 *
 *  @author  Shivani Kumari
 *  @version 1.0
 *  @since   6-11-2019
 *
 ******************************************************************************/

/*
 * PACKAGE NAME
 */
package com.bridgelabz.datastructure;

/*
 * Generic version of the LinkedList class.
 * 
 * @param <T> the type of the value
 */
public class LinkedList<T> {
	Node<T> head;

	class Node<T> {
		T data;
		Node<T> next;

		Node(T data) {
			this.data = data;
			next = null;
		}
	}

	/*
	 * add the data
	 */
	public void add(T data) {
		Node<T> new_data = new Node<T>(data);
		if (head == null) {
			head = new_data;
			return;
		}
		Node<T> temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = new_data;
	}

	/*
	 * search the data
	 */
	public boolean search(T item) {
		int count = 0;
		Node<T> temp = head;
		if (temp == null) {
			return false;
		} else {
			while (temp != null) {
				if (item.equals(temp.data)) {
					count++;
					break;
				}
				temp = temp.next;
			}
		}
		if (count > 0)
			return true;
		else
			return false;

	}

	/*
	 * Returns the size
	 */
	public void size(Node<T> head) {
		Node<T> temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		System.out.println(count);
	}

	/*
	 * index when we the item Which present on the list it gives the index value
	 * otherwise gives the invalied item message
	 */
	public void index(T item) {
		Node<T> temp = head;
		int count = 0;
		while (item != (temp.data)) {
			count++;
			temp = temp.next;

		}
		System.out.println(count);
	}

	/*
	 * Add element at the given position
	 */
	public void addElementFirst(T new_data) {
		if (head == null) {
			return;
		}
		Node<T> new_node = new Node<T>(new_data);
		new_node.next = head;
		head = new_node;
	}

	/*
	 * Insert at the given Position
	 */
	public void insertAtPosition(T data, Node<T> head, int position) {

		Node<T> new_data = new Node<T>(data);
		Node<T> temp = head;

		while (position > 1) {
			temp = temp.next;
			position--;
		}
		new_data.next = temp.next;
		temp.next = new_data;
	}

	/*
	 * Display the list
	 */
	public void display() {
		Node<T> t = head;
		while (t != null) {
			System.out.println(t.data);
			t = t.next;
		}

	}

	/*
	 * Reverse the LinkedList
	 */
	public void reverse(Node<T> head) {
		Node<T> t = head;
		if (t.next != null) {
			reverse(t.next);
		}
		System.out.println(t.data);
	}

	/*
	 * Insert at the end
	 */
	public void append(T data) {
		Node<T> new_data = new Node<T>(data);

		new_data.next = null;
		Node<T> t = head;
		while (t.next != null) {
			t = t.next;
		}
		t.next = new_data;
		return;
	}

	/*
	 * deleting the node
	 */
	public void delet(T data) {
		Node<T> temp = head, prev = null;

		if (temp.data.equals(data)) {
			head = temp.next;
			return;
		}

		while (temp != null && !temp.data.equals(data)) {
			prev = temp;
			temp = temp.next;
		}

		if (temp == null)
			return;

		prev.next = temp.next;

	}

	/*
	 * Deleting the middle
	 */
	public void deleteAtMid(T data, Node<T> head) {
		Node<T> temp = head;
		Node<T> newNode = null;
		if (temp == null) {
			System.out.println("Data not present");
		} else {
			while (temp.next != null) {
				if (temp.next.data.equals(data)) {
					newNode = temp.next;
					temp.next = temp.next.next;
				}
				temp = temp.next;
			}
		}
	}

	/*
	 * Deleting at the end
	 */
	public void deleteAtEnd(Node<T> head) {
		Node<T> t = head;
		while (t.next.next != null) {
			t = t.next;
		}
		t.next = null;
	}

	/*
	 * Remove all elements in the linked List
	 */
	public void removeAll(LinkedList list) {
		if (head == null) {
			System.out.println("No data present!!");
			return;
		}
		Node<T> temp = head;
		while (temp.next != null) {
			temp = temp.next;
			head = temp;
		}
		temp = head = null;
	}

	public static void main(String[] args) {
		LinkedList<Object> list = new LinkedList<Object>();
		System.out.println("Linked List data");
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.display();

		list.addElementFirst(5);
		list.insertAtPosition(15, list.head, 2);
		list.display();
		list.reverse(list.head);
		list.display();
		list.append(40);
		System.out.println("Insert at last");
		list.display();
		System.out.println("Deletion at first");
		list.delet(5);
		System.out.println("Delete\n");
		list.display();
		System.out.println("Deletion at mid");
		list.display();
		list.deleteAtMid(20, list.head);
		list.display();
		System.out.println("Deleting the node at last");
		list.deleteAtEnd(list.head);
		list.display();
		System.out.println("search element");
		boolean result = list.search(200);
		if (result) {
			System.out.println("Element Found in the list");
		} else {
			System.out.println("Element not found in the list");
		}

		list.display();
		System.out.println("size");
		list.size(list.head);

		try {
			list.index(200);
		} catch (Exception e) {
			System.out.println("Invalied item");
		}

		list.removeAll(list);
		System.out.println("Data remove Succesfully");
		list.display();

//		/*
//		 * System.out.println("Enter 1 for add");
//		 * System.out.println("Enter 2 for insert at fast");
//		 * System.out.println("Enter 3 for insert at mid");
//		 * System.out.println("Enter 4 for insert at last");
//		 * System.out.println("Enter 5 for reverse");
//		 * System.out.println("Enter 6 for delet at first");
//		 * System.out.println("Enter 7 for delet at mid");
//		 * System.out.println("Enter 8 for delet at last"); System.out.println("Exit");
//		 */
	}

}
