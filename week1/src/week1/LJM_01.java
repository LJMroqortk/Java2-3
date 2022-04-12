package week1;

import java.util.Scanner;

public class LJM_01 {
	public static void main(String[] args) {
		String name;
		
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		if(name == ("홍길동"))
			System.out.println("홍길동이 맞습니다.");
		else
			System.out.println("홍길동이 아닙니다.");
	}
}
