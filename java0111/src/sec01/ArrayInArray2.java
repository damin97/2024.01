package sec01;

import java.util.Scanner;

public class ArrayInArray2 {

	public static void main(String[] args) {
		// 스캐너를 이용해 2차원 배열의 크기를 입력 받아 점수를 입력 받도록 만들어보세요
        //  (p.190 선언부분 참고)

		Scanner scanner = new Scanner(System.in);
		int num = 0;

		System.out.print("1차원 배열의 크기를 입력하세요: ");
		int n1 = Integer.parseInt(scanner.nextLine());
		System.out.print("2차원 배열의 크기를 입력하세요: ");
		int n2 = Integer.parseInt(scanner.nextLine());
		int scores[][] = new int[n1][n2];
		System.out.println();

		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.printf("(%d, %d): ", i, j);
				scores[i][j] = Integer.parseInt(scanner.nextLine());
				num += scores[i][j];
			}
		}
		// 총점, 평균 계산해서 출력
		double avg = (double)num / (n1*n2); //n1*n2는 행과 열이 같을때만 가능
		System.out.println();
		System.out.println("총합: "+ num);
		System.out.println("평균: "+ avg);
	}
}
