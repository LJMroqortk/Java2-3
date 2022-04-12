package week1;

public class Twoquest {
	static int cnt = 0;
	public static int seq(int n) {
		cnt++;
		if(n == 1)
			return 1;
		else
			return seq(n-1) + 3;
	}
	public static void main(String[] args) {
		int n = 5;
		System.out.println("È½¼ö´Â : " + seq(n));
		System.out.println(cnt);
	}
}
