
public class StackClass {
	
	Node top;
	
	public StackClass() {
		// TODO Auto-generated constructor stub
		top = null;
	}
	
	public void push(int item) {
		
		Node tempNode = new Node(item);
		tempNode.next = top ;
		top = tempNode;
		
	}
	
	public int top() {
		
		if(top == null) {
			System.out.println(" Stack is empty ");
			
		}
		else {
		int item = top.item;
		return item;
		}
		return -1;
		
	}
	
	public void pop() {
		
		if(top == null) {
			System.out.println(" Stack is empty ");
		}
		else {
			top = top.next;
		}
	}
	
	public static void main(String[] args) {
		StackClass stack = new StackClass();
		
		stack.push(1);
		
		stack.push(2);
		
		System.out.println(stack.top());
		
		stack.pop();
		
		System.out.println(stack.top());
		
		stack.push(34);
		
		stack.push(40);
		System.out.println(stack.top());
		
		
		
	}
}
