package week1;

import java.util.Scanner;

public class ValueReference {
	public static void SampleAcess(int[] B, int n) {
		n++;
		B[n] = 8;
	}
	public static void main(String[] args) {
		int[] A = new int[10];
		A[5] = 7;
		int k = 5;
		for (int i : A) {
			System.out.print(i + " ");
		}
		System.out.println();
		SampleAcess(A,k);
		for (int i : A) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(k);
	}
	
}
