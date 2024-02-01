package ex.string;

public class StringTrimEx {

	public static void main(String[] args) {
		String str = "          가나 다             ";
		System.out.println(str.length());
		System.out.println(str.trim().length()); // 앞 뒤 공백 제거한 후 문자길이
		
		String str1 = String.valueOf(10); //문자열로 처리
		System.out.println(str1+30);

	}
}
