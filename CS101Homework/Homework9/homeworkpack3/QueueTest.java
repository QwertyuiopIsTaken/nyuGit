/*
Ricky Jian, 11/9/24
Program 9.3
The purpose of this program is to create a stack class to add and remove elements
*/

package homeworkpack3;

// Main file
public class QueueTest {
	public static void main(String[] args) {
		// Declaration
		Queue queue1 = new Queue();

		// Processing
		// put some numbers in the queue
		for (int i = 1; i <= 20; i++) {
			queue1.enqueue(i);
		}
		
		// Output
		// remove the numbers from front to back
		while (!queue1.empty()) {
			int removed = queue1.dequeue();
			System.out.println(removed + " ");
		}
	}
}