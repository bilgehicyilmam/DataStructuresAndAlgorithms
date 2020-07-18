package algorithms;

public class ArrayListQueue extends ArrayList{
	
	private int front;
	private int back;
	private AbstractList list;
	
	public ArrayListQueue() {
		front=back=0;
		list=new ArrayList();
	}
	
	public int size() {
		return back;
	}
	
	public boolean isEmpty() {
		return back==0;
	}

	public int peek() {
		return list.get(front);
		
	}
	
	public void enqueue(int value) {
		list.add(value);
		back++;
	}
	
	public int dequeue() {
		int value = list.get(front);
		list.remove(front);
		back--;
		return value; 
	}
	
    public static void main (String [] args) {
		
		ArrayListQueue queue=new ArrayListQueue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		System.out.println("Size of ArrayListQueue is: " + queue.size());
		System.out.println("The value at front is: " + queue.peek());
		System.out.print("Please remove first value from ArrayListQueue. The value to be removed is: "  );
		System.out.println(queue.dequeue());
		System.out.println("Second value to be removed is: " + queue.dequeue());
		System.out.println("Third value to be removed is: " + queue.dequeue());
		System.out.println("Fourth value to be removed is: " + queue.dequeue());
		System.out.println("Fifth value to be removed is: " + queue.dequeue());
		System.out.print("Is the ArrayListQueue empty? " + queue.isEmpty());
	}
}
