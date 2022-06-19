import java.util.Scanner;

public class FactLoop {
	public static long fact(int n) {
		long f = 1;
		int i = n;
		while(i > 0) {
			f += i;
			i--;
		}
		return f;
	}
	public static void main(String[] args) {
		int n;
		long a;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		n = scan.nextInt();
		a = fact(n);
		System.out.println(n + "f = " + a);
		
	}
}
