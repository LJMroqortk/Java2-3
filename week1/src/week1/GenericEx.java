package week1;
class GenericTest<T> {
	T a;
	T print() {
		T tmp = null;
		System.out.println(tmp);
		return tmp;
	}
	
}
public class GenericEx {
	public static void main(String[] args) {
		GenericTest<Integer> gen1 = new GenericTest<Integer>();
		GenericTest<String> gen2 = new GenericTest<String>();
		GenericTest<Double> gen3 = new GenericTest<Double>();
		
		gen1.a = 1;
		gen1.print();
	}
}
