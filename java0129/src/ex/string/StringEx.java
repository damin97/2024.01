package ex.string;

public class StringEx {

	public static void main(String[] args) {
		String aaa = "aaa";
		String bbb = "bbb";
		
		//1
		StringBuilder sb = new StringBuilder();
		sb.append(aaa);
		sb.append(bbb);
		System.out.println(sb);
		
		//2
		String str = aaa + bbb;
		System.out.println(str);
		
		//3
		String str1 = aaa.concat(bbb);
		System.out.println(str1);
	}

}
