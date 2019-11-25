/******************************************************************************

 *  Purpose: Dequeue class
 *
 *  @author  Shivani Kumari
 *  @version 1.0
 *  @since   9-11-2019
 *
 ******************************************************************************/

/*
 * PACKAGE NAME
 */
package com.bridgelabz.datastructure;

/*
 * INPORT STATEMENTS
 */
import utility.MyNode;

public class Dequeue<T> {

//		public  MyNode<T> character=null;
//		MyNode<T> head;
	MyNode<T> front;
	MyNode<T> rear;
	int count = 0;

	/*
	 * Dequeu Constructor
	 */
	public Dequeue() {
		this.front = null;
		this.rear = null;
	}

	/*
	 * Check Empty or not
	 */
	public boolean isEmpty() {
		if (front == null)
			return true;
		else
			return false;
	}

	/*
	 * Check the size
	 */
	public int size() {
		return count;
	}

	/*
	 * Add item at the front End
	 */
	public void addFront(T item) {
		MyNode<T> new_Node = new MyNode<T>(item);
		if (front == null) {
			front = new_Node;
			rear = front;
			count++;
		} else {
			new_Node.next = front;
			front = new_Node;
		}
		count++;
	}

	/*
	 * Add item at the Rear End
	 */
	public void addRear(T item) {
		MyNode<T> new_Node = new MyNode<T>(item);
		if (rear == null) {
			rear = new_Node;
			front = rear;
		} else {
			rear.next = new_Node;
			rear = new_Node;
		}
		count++;
	}

	/*
	 * Remove Element at the Front End
	 */
	public MyNode<T> removeFront() {
		MyNode<T> temp = front;
		front = front.next;
		count--;
		return temp;
	}

	/*
	 * Remove Element from the last
	 */
	public MyNode<T> removeLast() {
		MyNode<T> temp = front;
		MyNode<T> prev = null;
		while (temp.next != null) {
			prev = temp;
			temp = temp.next;
			count--;
		}
		prev.next = null;
		count--;
		return temp;
	}

	/*
	 * Display the dequeue Elements
	 */
	public void display() {
		MyNode<T> temp = front;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Dequeue<Integer> dequeue = new Dequeue<Integer>();
		dequeue.addFront(10);
		dequeue.addFront(20);
		dequeue.addFront(30);
		dequeue.display();

		int result = dequeue.size();
		System.out.println(result);

		dequeue.removeFront();
		dequeue.display();

		dequeue.removeLast();
		dequeue.display();

	}
}
