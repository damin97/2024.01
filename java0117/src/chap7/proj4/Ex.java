 package chap7.proj4;

public class Ex {

	public static void main(String[] args) {
		Controller controller = new Controller();
		
		controller.setService(new MemberService());
		
	}
}
