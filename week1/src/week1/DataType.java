package week1;

// ����͹�
public class DataType {
	public static int fact1(int n) {
		int tmp = 1;
		for(int i = 2; i <=n; i++) 
			tmp += i;
				return tmp;	
	}
// ��͹�
	public static int fact2(int n) {
		if(n == 1)
			return 1;
		else
			return n+fact2(n-1);
	}
	public static void main(String[] args) {
			System.out.println(fact1(5));
			System.out.println(fact2(5));
	}
}
// 1 + 1 2 3 4 5 (����͹�) 5 + 4 3 2 1 0 (��͹�) 