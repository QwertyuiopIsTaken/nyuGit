package homeworkpack3;

// Class file
public class Queue {
	// Instance Variables
	private int[] elements;
	private int size;
	private static final int DEFAULT_CAPACITY = 8;
	
	public Queue() {
		size = 0;
		elements = new int[DEFAULT_CAPACITY];
	}
	
	public void enqueue(int v) {
		if (size >= elements.length) { // when the array reaches its capacity
			int temp[] = new int[elements.length * 2];
			for (int i = 0; i < elements.length; i++) {
				// copy the array to the new array
				temp[i] = elements[i];
			}
			elements = temp;
		}
		elements[size] = v;
		size++;
	}
	
	public int dequeue() {
		int first = elements[0];
		// Replace the front element with the next one it reaches the last element
		for (int j = 0; j < size - 1; j++) {
			elements[j] = elements[j + 1];
		}
		size--;
		elements[size] = 0; // avoids possible confusion
		return first;
	}
	
	public boolean empty() {
		return (size <= 0);
	}
	
	public int getSize() {
		return size;
	}
}