/******************************************************************************

 *  Purpose: Queue implementation
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

public class Queue<T> {

	Node<T> front;
	Node<T> rear;
	int count = 0;

	class Node<T> {
		T data;
		Node<T> next;

		Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	/*
	 * Queue constructor
	 */
	public Queue() {
		this.front = null;
		this.rear = null;
	}

	/*
	 * Enqueue the item
	 */
	public void enqueue(T item) {
		Node<T> temp = new Node<T>(item);
		if (rear == null) {
			front = temp;
			rear = temp;
			count++;
			return;
		}
		rear.next = temp;
		rear = temp;
		count++;
	}

	/*
	 * Dequeue the data
	 */
	public void dequeue() {
		Node<T> temp = front;
		if (front == null) {
			System.out.println("Queue is empty");
			return;
		}
		front = front.next;
		if (front == null) {
			rear = null;
		}
		count--;
	}

	/*
	 * Check Empty
	 */
	public boolean isEmpty() {
		if (count == 0) {
			return true;
		}
		return false;
	}

	/*
	 * Size of the Queue
	 */
	public int size() {
		return count;
	}

	/*
	 * Display the Queue data
	 */
	public void display() {
		Node<T> temp = front;
		if (temp == null) {
			System.out.println("No data present");
			return;
		}
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>();
		queue.enqueue(20);
		queue.enqueue(40);
		queue.enqueue(60);
		queue.display();

		int result = queue.size();
		System.out.println("size " + result);

		queue.dequeue();
		queue.display();

		int result1 = queue.size();
		System.out.println("size " + result1);

		boolean empty = queue.isEmpty();
		if (empty)
			System.out.println("Empty Queue");
		else
			System.out.println("Not a empty queue");
	}
}
