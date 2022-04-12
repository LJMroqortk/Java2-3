package week1;

public class CtrstmEx3 {
	public static void main(String[] args) {
		int[] abc = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("1 3 5 7 9");
		for (int i = 0; i < abc.length; i++) {
			if(abc[i] % 2 == 1)
				System.out.println("Ã¹¹øÂ° : " + abc[i]);
		}
		for (int i = 1; i <= 10; i+=2) {
			System.out.println(i);
		}
		for (int i = 1; i <= 10; i++) {
			if(i%2==0)
				continue;
			System.out.println(i);
		}
		int i = 1;
		while(i<=10) {
			if(i%2==0) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}
}
