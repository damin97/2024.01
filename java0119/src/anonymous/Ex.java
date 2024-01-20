package anonymous;

class AnyClass {
	void mmm() {};
}

public class Ex {

	public static void main(String[] args) {
		
		
		AnyClass ac = new AnyClass() {

			@Override
			void mmm() {
				// TODO Auto-generated method stub
				super.mmm();
			}
			
		}; //익명의 자식 객체이다. 이름이 없다.

	}
}
