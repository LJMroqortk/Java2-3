
public class ArrayQueueTest {
	public static void main(String[] args) {
		ArrayQueue<Integer> aq = new ArrayQueue<Integer>();
		Integer temp;
		aq.enqueue(100); aq.enqueue(200); 
		aq.enqueue(300); aq.enqueue(400);
		aq.printAll();
		temp = aq.dequeue();
		aq.printAll();
	}
}
