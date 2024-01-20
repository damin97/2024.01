package sec02.exam06;

public class InstanceofExample {
	
	public static void method1(Parent parent) {
		
	}
	
	public static void method2(Parent parent) {
		Child child = (Child)parent;
		System.out.println("변환 가능");
	}

	public static void main(String[] args) {
//		Parent parentA = new Child();
//		method2(parentA);
		
//		Parent parentB = new Parent();
		Parent parentB = new Child();
		if(parentB instanceof Child) {
			method2(parentB);
		}else {
			System.out.println("변환 불가");
		}
		

	}

}
