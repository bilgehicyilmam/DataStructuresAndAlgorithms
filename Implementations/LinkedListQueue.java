package algorithms;

public class LinkedListQueue extends LinkedList {
	
	    private Node front;
		private Node back;
		private int size;

		public LinkedListQueue() {
			front=null;
			back=null;
			size=0;
		}

		public int size() {
			return size;
		}
		
		public boolean isEmpty() {
			return size==0;
		}
		
		public int peek() {
			if(front==null) {
				throw new RuntimeException();
			}else{
				return front.data;
			}
		}
		
	    public void enqueue(int value) {
	        Node temp = back;
	        back = new Node(value, null);
	        if (front == null) {
	            front = back;
	        } else {
	            temp.next = back;
	        }
	        size++;
	    }

	    public int dequeue() {
	        if (front == null) {
	            throw new RuntimeException();
	        }
	        int n = front.data;
	        front = front.next;
	        size--;
	        return n;
	    }
	
	
	public static void main(String[] args) {
		
		LinkedListQueue myQueue=new LinkedListQueue();
		myQueue.enqueue(10);
		myQueue.enqueue(20);
		System.out.println("The size of LinkedListQueue is: " + myQueue.size());
		System.out.println("The value to be removed is: " + myQueue.dequeue());
		System.out.println("The value to be removed is: " + myQueue.dequeue());
		myQueue.enqueue(30);
		myQueue.enqueue(40);
		System.out.println("Please add 30 and 40 to Queue. Current size of Queue is: " + myQueue.size());
		System.out.println("The value at front is: " + myQueue.peek());
		System.out.println("The value to be removed is: " + myQueue.dequeue());
		System.out.println("The value to be removed is: " + myQueue.dequeue());
		System.out.println("Is the LinkedListQueue Empty? " + myQueue.isEmpty());
	}
}
