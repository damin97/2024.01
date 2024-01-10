package sec05.exam01;

public class Animal {
	private String name; // private은 외부 클래스에서 직접 접근 못한다는 뜻
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
