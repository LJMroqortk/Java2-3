package week1;

public class datatypes {
	static int cnt = 0;
	public static int seq(int n) {
		cnt++;
		if(n == 0)
			return 0;
		else
			return 5 * seq(n-1) + 3;
	}
	public static void main(String[] args) {
		System.out.println(seq(5));
		System.out.println(cnt);
	}
}
