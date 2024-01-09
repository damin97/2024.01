package chap05;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		
//		int[] scores= {83, 90, 87}; //int scores[];
//		System.out.println("scores.length");
		Scanner scan = new Scanner(System.in);
		System.out.println("생성할 배열의 개수");
		int num = scan.nextInt();
		int[]scores = new int[num];

//		System.out.println(scores[0]);
//		System.out.println(scores[1]);
//		System.out.println(scores[2]);
		
//		for(int i = 0; i < scores.length; i++) {
//			System.out.println(scores[i]);
//		}
		String str = "abc";
		System.out.println(str.length());
		
		
		String[]names = new String[5];
		names[0]=str;
		names[1]="김다민";
		names[2]="김다민";
		for(int i = 0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
	}

}
