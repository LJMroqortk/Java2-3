package week1;

public class CtrstmEx2 {
	public static void main(String[] args) {
		int[] abc = {1,2,3,4,5,6,7,8,9,10};
		for (int i = 0; i < abc.length; i++) {
			System.out.println( abc[i]);
		}
		for (int i : abc) {
			System.out.println(i);
		}
	}
}
