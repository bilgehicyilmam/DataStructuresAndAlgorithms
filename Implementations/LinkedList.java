package algorithms;

public class LinkedList extends AbstractList {
	
	private Node head;
	protected int size;
	
	public class Node {
		protected Node next;
		protected int data;
		
		public Node(int data,Node next) {
			this.next=next;
			this.data=data;
		}
	}
	
	public int size() {
		return size;
	}
	
	public int get(int index) {
		if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
		Node current=head;
	    for(int i=0; i<index; i++) {
	    	current=current.next;
		}
        return current.data;
	}
	
	public void set(int index, int value) {
		if(index>=size) {
			throw new IndexOutOfBoundsException();
		}
		Node current=head;
		for(int i=0; i<index; i++) {
			current=current.next;
		}
		current.data=value;
	}
	
	public void add(int value) {
		if(head==null) {
			head=new Node(value,head);
			size++;
			return;
		}
		Node current=head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=new Node(value,current.next);
		size++;
	}
	
	public void remove(int index) {
		if (index >= size) {
			throw new IndexOutOfBoundsException();
	    }
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
        	current = current.next;
	    }
        current.next=current.next.next;
	    size--;
	}
	
	public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;

        while (current != null) {
            sb.append(" ").append(current.data);
            current = current.next;
        }
        return sb.toString();
    }
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30); 
		list.add(40);
		System.out.print("Items of LinkedList are: ");
		System.out.println(list.toString());
		list.remove(1);
		System.out.print("Please remove index 1 from LinkedList, and print out new List: ");
		System.out.println(list.toString());
		list.set(2,70);
		System.out.print("Please set index 2 as 70, and print out new List: ");
		System.out.println(list.toString());
		System.out.print("The value at index 1 is: ");	
		System.out.println(list.get(1));	
		System.out.print("Size of the new LinkedList is: ");
		System.out.println(list.size());
	}
}
