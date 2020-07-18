package algorithms;

public class ArrayList extends AbstractList {

	protected int[] array;
	protected int size;
	protected int capacity;

	public ArrayList() {
		size = 0;
		capacity = 8;
		this.array = new int[capacity];
	}

	public int size() {
		return size;
	}

	public void grow() {
		if (size < capacity) {
			return;
		}
		int[] newArray = new int[capacity * 2];
		for (int i = 0; i < capacity; i++) {
			newArray[i] = this.array[i];
		}
		this.array = newArray;
		capacity = capacity * 2;
	}

	public int get(int index) {
		if (index >= size) {
			throw new IndexOutOfBoundsException();
		}
		return array[index];
	}

	public void set(int index, int value) {
		if (index >= size) {
			throw new IndexOutOfBoundsException();
		}
		array[index] = value;
	}

	public void add(int value) {
	       grow();
	       array[size] = value;
	       size++;
	}

	public void remove(int index) {
		if (index >= size) {
			throw new IndexOutOfBoundsException();
		}
		for (int i = index; i < size + 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<size; i++) {
			sb.append(" ").append(array[i]);
		}
		return sb.toString();
	}

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(100);
		list.add(200);
		System.out.println("ArrayList is: " + list.toString());
		System.out.println("Please get index 9 from the list: " + list.get(9));
		System.out.println("Please remove index 9 from the list!");
		list.remove(9);
		System.out.println("ArrayList after deleting index 9 is: " + list.toString());
		list.set(8, 90);
		System.out.println("ArrayList after setting index 8 as 90 is: " + list.toString());
	}
}
