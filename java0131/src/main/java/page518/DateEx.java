package page518;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		Date now = new Date();
		String strnow1 = now.toString();
		System.out.println(strnow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
		String strnow2 = sdf.format(now);
		System.out.println(strnow2);
	}

}
