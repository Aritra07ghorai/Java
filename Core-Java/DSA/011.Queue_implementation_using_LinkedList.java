/*
Name:Aritra Ghorai
Date:11/Nov/2022
*/

public class QueueUsingLinkedList {
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	static class Queue{
		static Node head = null;
		static Node tail = null;
		
		public static boolean isEmpty() {
			return head == null & tail == null;
		}
		
		//enqueue
		public static void add(int data) {
			Node newNode =new Node(data);
			if(tail == null) {
				tail = head = newNode;
				return;
			}
			tail.next = newNode;
			tail = newNode;
		}
		
		//dequeue 
		public static int remove() {
			if(isEmpty()) {
				System.out.println("Empty queue");
				return -1;
			}
			int front = head.data;
			if(head == tail) {
				tail = null;
			}
			head = head.next;
			return front;
		}
		
		//peek
		public static int peek() {
			if(isEmpty()) {
				System.out.println("Empty queue");
					return -1;
			}
			return head.data;
		}
		
		public static void main(String[] args) {
			Queue q1 = new Queue();
			q1.add(1);
			q1.add(2);
			q1.add(3);
			q1.add(4);
			q1.add(5);
			
			while(!q1.isEmpty()) {
				System.out.println(q1.peek());
				q1.remove();
			}
		}
	}
}
