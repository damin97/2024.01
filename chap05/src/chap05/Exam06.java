package chap05;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("메뉴 선택>");

			int selectNo = scan.nextInt();

			if (selectNo == 1) {
				System.out.print("학생수>");
				studentNum = scan.nextInt();
				scores = new int[studentNum];

			} else if (selectNo == 2) {
				for(int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]>");
					scores[i] = scan.nextInt();
				}
			} else if (selectNo == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]>" + scores[i]);
				}
			} else if(selectNo == 4) {
				System.out.print("최고점수: ");
				int max = 0;
				for(int val: scores) {
					if(max < val) {
						max = val;
					}
				}System.out.println(max);
				
				System.out.print("평균점수: ");
				int sum=0;
				for(double num: scores) {
					sum += num;
				}
				double avg = (double)sum / studentNum; // 순서가 주의!
				System.out.println(avg);
				
			}else if(selectNo == 5) {
				run=false;
			}
		}System.out.println("프로그램 종료");

	}

}
