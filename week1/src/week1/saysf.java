package week1;

public class saysf {
	public static int count = 0;
	public static void main(String[] args) {
		int n = 5;
		System.out.println(fibonacci(n));
		System.out.println("½ÇÇàÈ½¼ö : " + count);
	}
	public static int fibonacci(int n) {
		count++;
		if(n == 1 || n == 2)
			return 1;
		else
			return fibonacci(n-1) + fibonacci(n-2);
	}
}
// 4 3 2 1 0 3 2 1 0  