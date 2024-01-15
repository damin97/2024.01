package sec05.exam02;

public class Person {
	public static final double PI = 3.141592; //상수
	final static public double PI1 = 3.141592; //상수
	final String name; //final이 붙으면 초기화를 한번만 하겠다는 말
	
	public Person(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		System.out.println(Math.PI);
		Person person = new Person("홍길동");
		System.out.println(person.name);
		
		final int x; //final은 한번만 초기화 할 수 있다
		x=300;
//		x=500;
			
	}
}
