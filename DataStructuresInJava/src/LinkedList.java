class Node{
	int item;
	Node next;
	
	public Node(int item) {
		
		// TODO Auto-generated constructor stub
		this.item = item;
		this.next = null;
		
	}
}
public class LinkedList {
	
	Node headNode;
	
	public LinkedList() {
	
		// TODO Auto-generated constructor stub
		headNode = null;
	}
	
	public void add(int item) {
		
		if(headNode == null) {
			headNode = new Node(item);
		}
		else {
			
			Node tempNode = headNode ;
			while(tempNode.next != null) {
				tempNode = tempNode.next;
			}
			tempNode.next = new Node(item);
		}
	}
	
	public void print() {
		
		Node tempNode = headNode;
		while(tempNode != null) {
			
			if(tempNode.next != null)
			System.out.print(tempNode.item+"->");
			else {
				System.out.print(tempNode.item);
			}
			tempNode = tempNode.next;
		}
		System.out.print("\n");
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add(1);
		
		list.add(2);
		
		list.print();
		
		list.add(30);
		list.add(20);
		list.print();
	}
}
