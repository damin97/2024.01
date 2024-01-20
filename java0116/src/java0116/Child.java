package java0116;

class Parent2 {}

class Parent { //부모 클래스
	int money = 100;
	
	void disp() {
		System.out.println(money);
	}
}

public class Child extends Parent { //자식 클래스
	
	public Child(){ //생서자
		this.money += 300;
	}
	
	public static void main(String[] args) {
		Child ch = new Child();
		ch.disp();
//		System.out.println(ch.money);
	}
}
