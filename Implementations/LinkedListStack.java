package algorithms;

public class LinkedListStack extends LinkedList{
	
	protected Node top;
	protected int size;
	
	public LinkedListStack() {
		top=null;
	}

	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}

	public void push(int value) {
		top = new Node(value,top);	
		size++;
	}
	
	public int pop() {
		if(top==null) {
			throw new RuntimeException();
		}else {
			int n=top.data;
			top=top.next;
			size--;
			return n;
		}
	}
	
	public int peek() {
		if(top==null) {
			throw new RuntimeException();
		}else{
			return top.data;
		}
	}
	
	public static void main(String args[]) {
		
		LinkedListStack myStack = new LinkedListStack();
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		myStack.push(40);
		System.out.println("The size of LinkedListStack is: " + myStack.size());
		System.out.println("The value at top is: " + myStack.peek());
		System.out.println("The value to be popped is: " + myStack.pop());
		System.out.println("The value to be popped is: " + myStack.pop());
		System.out.println("The value to be popped is: " + myStack.pop());
		System.out.println("The value to be popped is: " + myStack.pop());
		System.out.println("Is the LinkedListStack Empty? " + myStack.isEmpty());
	}
}

