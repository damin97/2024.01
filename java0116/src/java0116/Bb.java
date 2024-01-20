package java0116;

class Aa {
	private int y;
	final int x;
	
	void method() {}
	
	Aa(){
		this.x = 0;
	}
	
	Aa(int x){
		this.x = x;
	}
	
	Aa(int x, int y){
		this.x = x;
		this.y =y;
	}
}
public class Bb extends Aa {
	
	@Override
	void method() {
		super.method(); // 재정의 부모 메소드 말고 원래 부모 메소드를 실행
//		x =40; // final 필드 값 변경 안됨
//		System.out.println(this.x); //x, this.x, super.x 모두 작성가능
//		System.out.println(y); // private 이라서 접근 못함
	}
}
