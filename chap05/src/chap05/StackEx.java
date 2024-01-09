package chap05;

public class StackEx {

	public static void main(String[] args) {
		
//		int age = 32; // primitive type, 기본타입
		
//		int[]intArray = null;
//		intArray[0]=10; // 방이 없는데 값을 넣을려고 해서 NullPointerException이 발생한다
		
//		String str=null;
//		System.out.println(str.length()); //힙 영역의 공간이 없는데 힙 영역의 길이를 묻기 때문에 오류 발생
		
		String str="김다민";
		System.out.println(str.length());
		
		String name1 = "신용권";
		String name2 = "신용권";
		System.out.println(name1 == name2);
		System.out.println(name1.equals(name2));
		
		System.out.println("---------");
		
		String name3 = new String("신용권");
		String name4 = new String("신용권");
		System.out.println(name3 == name4);
		System.out.println(name3.equals(name4));
		
		

	}

}
