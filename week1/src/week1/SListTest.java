package week1;

public class SListTest {
	public static void main(String[] args) {
		SList<String> s = new SList<String>();
		s.insertFront("oragne"); s.insertFront("apple");
		s.insertAfter("cherry", s.head.getNext());
		s.insertFront("pear");
		s.print();
		System.out.println("s의 길이 = " + s.size());
		System.out.println("체리가 " + s.search("cherry") + "번째에 있습니다.");
		System.out.println("키위가" + s.search("kiwi") + "번째에 있습니다.");
		s.deleteFront();
		s.print();
		System.out.println("s의 길이 = " + s.size());
		SList<Integer> t = new SList<Integer>();
		t.insertFront(500); t.insertFront(300);
		t.insertAfter(400, t.head);
		t.insertFront(100);
		t.insertAfter(300, t.head.getNext());
		t.print();
		System.out.println(": t의 길이 = " + t.size());
	}
}
