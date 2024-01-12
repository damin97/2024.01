package sec03.exam01;

import java.util.Calendar;

public class WeekEx {

	public static void main(String[] args) {
		Week today = null;

		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH)+1;
		System.out.println(month);
		int week = cal.get(Calendar.DAY_OF_WEEK);

		switch (week) {
		case 1:
			today = Week.일;
			break;

		case 2:
			today = Week.월;
			break;

		case 3:
			today = Week.화;
			break;

		case 4:
			today = Week.수;
			break;

		case 5:
			today = Week.목;
			break;

		case 6:
			today = Week.금;
			break;

		case 7:
			today = Week.토;
			break;
		}

		System.out.println("오늘 요일: " + today);

		if (today == Week.일) {
			System.out.println("일요일에는 교회를 갑니다.");
		} else {
			System.out.println("열심히 자바 공부를 합니다.");
		}
	}
}
