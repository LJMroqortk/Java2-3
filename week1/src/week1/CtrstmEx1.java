package week1;

public class CtrstmEx1 {
	public static void main(String[] args) {
		outer:
		for (int i = 1; i < 10; i++) {
			inner:
			for (int j = 1; j < 10; j++) {
				if(i+j == 5)
					break outer;
				System.out.printf(" i = %d, j = %d ",i,j);
			}
			System.out.println();
		}
	}
}
