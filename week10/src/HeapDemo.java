

public class HeapDemo {

	public static void main(String[] args) {
	    	System.out.println("Heap w/ Exception!");
			Heap<Integer> h = new Heap<>(20);
			try {           
				h.insert(1);
				h.insert(10);
				h.insert(30); 
//				h.clear();
				h.insert(10);
				h.insert(30); 
				h.insert(20); 
				h.insert(40);
				h.buildHeap();
				h.heapPrint();
//				h.deleteMax();
//				h.insert(1); 
//				h.insert(3); // 여기서 PQException
				h.deleteMax();
				h.heapPrint();
			} catch (PQException e) {
				String msg = e.getMessage();
				System.out.println(msg);
				
			}
	  }
} // 코드 8-4