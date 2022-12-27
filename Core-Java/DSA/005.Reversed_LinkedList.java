/*
Name:Aritra Ghorai
Date:08/Nov/2022
*/

public class ReverseLL {

	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	//add-first
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next= head;
		head = newNode;	
	}
	
	//add last
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node currNode= head;
		while(currNode.next !=null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}
	
	//print list
	public void printList() {
		Node currNode= head;
		while(currNode !=null) {
			System.out.print(currNode.data + "->");
			currNode = currNode.next;
		}
		System.out.println("NULL");	
	}
	
	public void reverseIterator() {
		if(head == null || head.next == null) {
			return;
		}
		
		Node prevNode = head;
		Node currNode = head.next;
		while(currNode != null){
			Node nextNode = currNode.next;
			currNode.next = prevNode;
			
			//update
			prevNode = currNode;
			currNode = nextNode;
		}
		head.next =null;
		head = prevNode;
	}
	
	//Reverse LinkedList using recursive function
	public Node reverseRecursive(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node newHead =reverseRecursive(head.next);
		head.next.next =head;
		head.next = null;
		return newHead;
	}
	
	public static void main(String[] args) {
		ReverseLL list = new ReverseLL();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.printList();
		
		list.reverseIterator();
		list.printList();
		
		list.head= list.reverseRecursive(list.head);
		list.printList();
	}
}
