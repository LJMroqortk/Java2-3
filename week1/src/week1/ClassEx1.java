package week1;
class ObjectEx {
	private int a, b;
	
	public ObjectEx(int a) {
		super();
		this.a = a;
	}

	public ObjectEx(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "ObjectEx [a=" + a + ", b=" + b + "]";
	}
}
public class ClassEx1 {
	public static void main(String[] args) {
		ObjectEx obj1 = new ObjectEx(1, 2);
		ObjectEx obj2 = new ObjectEx(3);
		
		obj1.setA(6);
		System.out.println(obj1);
	}

	
}
// if switch for for - each while do - while break continue return