package sec02.exam01;

public class Anonymous {
	Person field = new Person() {
		void work() { //익명의 자식 객체 소속
			System.out.println("출근");
		}

		@Override
		void wake() {
			// TODO Auto-generated method stub
			System.out.println("6시 기상");
			work();
		}
		
	};
		
	void method1() {
		Person localVar = new Person() { //지역변수
			void walk() {
				System.out.println("산책");
			}

			@Override
			void wake() {
				// TODO Auto-generated method stub
				System.out.println("7시 기상");
				walk();
			}
			
		}; 
		localVar.wake();
		
	}
	
	void method2(Person person) {
		person.wake(); // 실행 명령
	}
}
