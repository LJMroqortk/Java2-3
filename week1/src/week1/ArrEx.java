package week1;

import java.util.Scanner;

public class ArrEx {
	public static void ArrEx1(int[] arr1, int idx) {
		int i;
		for (i = idx; i < arr1.length-1; i++) {
			arr1[i] = arr1[i+1];
		}
		arr1[i] = 0;
	}
	public static void ArrIns(int[] arrin, int idx, int val) {
		int i;
		for (i = arrin.length - 1; i > idx; i--) {
			arrin[i] = arrin[i - 1];
		}
		arrin[idx] = val;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] a = {10,20,30,40,50};
		int index, value;
		//System.out.print("삭제할 index 번호 입력 : ");
		System.out.print("삽입할 index 번호 입력 : ");
		index = scn.nextInt();
		System.out.print("삽입할 value 입력 : ");
		value = scn.nextInt();
//		ArrEx1(a,index);
		ArrIns(a,index,value);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
//		int[] a = new int[5]; //스텍 힙
//		int[] b; // 힙
//		b = new int[5]; // 스텍
//		int[] a = {10,20,30,40,50};
//		Scanner scan = new Scanner(System.in);
//		System.out.print("5개 정수 입력 :");
//		for (int i = 0; i < a.length; i++) {
//			a[i] = scan.nextInt();
//		}
//		for (int i = 0; i < a.length; i++) {	
//			System.out.println(a[i]);
//		}
	}
}
