package java0116;

public class Student extends People {
	String hakbun;

	public Student(String name, String hakbun) {
//		super(name); //부모의 생성자 호출
		this.hakbun = hakbun;
	}
	
	void method3() {
		method1();
	}

	@Override // 재정의 표시
	void method1() {
		// TODO Auto-generated method stub
		method1(); //부모 메소드 실행 의미 (생략 가능)
	}
}
