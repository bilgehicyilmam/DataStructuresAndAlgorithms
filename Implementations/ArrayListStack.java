package algorithms;

public class ArrayListStack extends ArrayList {
	
	private int top;
	private AbstractList list; 
	
	public ArrayListStack() {
	    list=new ArrayList();
	   
	}
	
	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		return top==0;
	}
	
	public int peek() {
		if(top==0) {
			throw new RuntimeException();
		}else{
			return list.get(top-1);
		}
	}
	
	public void push(int value) {
		list.add(value);
		top++;
	}
	
	public int pop() {
		int value = list.get(top - 1);
		list.remove(top-1);
		top--;
		return value;
	}
	
	public static void main (String [] args) {
		
		ArrayListStack stack=new ArrayListStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println("Size of ArrayListStack is: " + stack.size());
		System.out.println("The value at top is: " + stack.peek());
		System.out.print("Please remove top value from ArrayListStack. The value to be popped is: "  );
		System.out.println(stack.pop());
		System.out.println("Second value to be popped is: " + stack.pop());
		System.out.println("Third value to be popped is: " + stack.pop());
		System.out.println("Fourth  value to be popped is: " + stack.pop());
		System.out.println("Fifth  value to be popped is: " + stack.pop());
		System.out.print("Is the ArrayListStack empty? " + stack.isEmpty());
	}
}

