package week1;
class ListNode {
	private String data;
	public ListNode link;
	public ListNode() {
		
		this.data = null;
		this.link = null;
	}
	public ListNode(String data) {
		this();
		this.data = data;
	}
	public ListNode(String data, ListNode link) {
		
		this.data = data;
		this.link = link;
	}
	public String getData() {
		return this.data;
	}
}
public class LinkListEx1 {
	public static void main(String[] args) {
		
	}
}
