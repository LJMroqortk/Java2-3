package test;

public class LinkedListDemo {
	public static void main(String[] args) {
		System.out.println("Linked List Demo!");
		LinkedList<Integer> list = new LinkedList<>();
		list.add(0, 100);
		list.add(0, 200);
		list.add(0, 300);
		list.add(0, 400);
		list.printreverse();
	}
} // 코드 5-10