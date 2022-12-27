/*
Name:Aritra Ghorai
Date:07/Aug/2022
*/

public class LL {
	Node head;
	private int size;
	
	LL(){
		this.size = 0;
	}
	
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data = data;
			this.next = null;
			size++;
		}
	}
	
	//add-first
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next= head;
		head = newNode;	
	}
	
	//add last
	public void addLast(String data) {
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
	
	//Delete first
	public void deleteFirst(){
		if(head == null) {
			System.out.println("The list is  empty");
			return;
		}
		size--;
		head = head.next;
	}
	
	//delete Last
	public void deleteLast() {
		if(head == null) {
			System.out.println("The list is  empty");
			return;
		}
		
		size--;
		if(head.next == null) {
			head = null;
			return;
		}
		
		Node secondLast = head;
		Node lastNode = head.next;
		while(lastNode.next !=null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;			
		}
		secondLast.next = null;
	}
	
	public int getSize() {
		return size;
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
	
	
	public static void main(String[] args) {
		LL list = new LL(); //creating Linked List Object
		list.addFirst("a");
		list.addFirst("is");
		list.printList();
		System.out.println(list.getSize());
		
		list.addLast("list");
		list.printList();
		System.out.println(list.getSize());
		
		list.addFirst("This");
		list.printList();
		System.out.println(list.getSize());
		
		list.deleteFirst();
		list.printList();
		System.out.println(list.getSize());
		
		list.deleteLast();
		list.printList();
		
		System.out.println(list.getSize());
	}
}
