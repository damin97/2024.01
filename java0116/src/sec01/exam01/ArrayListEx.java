package sec01.exam01;

import java.util.ArrayList;
import java.util.List;

class Student {
	String name;
	int kor;

	public Student(String name, int kor) {
		super();
		this.name = name;
		this.kor = kor;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + "]";
	}
}

public class ArrayListEx {
	public static void main(String[] args) {
		String[] strArr = new String[100]; //고정된 배열, 속도 빠름
		List<Student> slist = new ArrayList<>(); //축약형
		slist.add(new Student("홍길동", 90));
		slist.add(new Student("김다민", 94));
		slist.add(new Student("안혜원", 97));
		
		for(Student student : slist) {
			System.out.println(student);
		}
		
		
		
		
		ArrayList<String> alist = new ArrayList<String>(); // 문자열을 가변적인 배열로
		List<String> list = new ArrayList<>(); //축약형
		list.add("홍길동");
		list.add("김하나");
		list.add("김예나");
		for(String str : list) {
			System.out.println(str);
		}
		list.set(1, "김다민");
		for(String str : list) {
			System.out.println(str);
		}
	}
}
