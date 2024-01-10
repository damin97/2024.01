package sec02.exam5;

import java.util.Scanner;

public class ContinueEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = null;
		int[] arr1 = new int[5];
		int[] arr2 = null;
		
		System.out.print("크기: ");
		int size = scanner.nextInt();
		arr2 = new int[size];
		
		arr = arr2; //힙에 있는 메모리 주소를 복사
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr[i]);
		}
		
		arr2[1]=100;
		System.out.println(arr[1]);
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//			if (i == 6) {
//				continue;
//			}
//			System.out.println("나오나?");
//		}
	}
}
