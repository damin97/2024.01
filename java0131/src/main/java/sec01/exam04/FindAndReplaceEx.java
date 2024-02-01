package sec01.exam04;

public class FindAndReplaceEx {

	public static void main(String[] args) {
		String str = "모든 프로그램은 자바 언어로 개발할 수 있다.";
		int index = str.indexOf("자바");
		str = str.replace("자바", "Java");
		System.out.println(str);

	}

}
