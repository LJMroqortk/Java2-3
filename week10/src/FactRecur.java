import java.util.Scanner;

public class FactRecur {
	public static int fact(int n) { // 4을 입력 시 
		if(n == 1) // 1이 나올 시 true로 빠진다는 것  
			return 1; // true
		else
		 return  n * fact(n - 1) + 3; // 3 2 1 * 4 근데 왜 ? long이라는 데이터 타입을 쓰나? 
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
