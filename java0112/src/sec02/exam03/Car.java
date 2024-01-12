package sec02.exam03;

public class Car {
	int gas;
	
	void setGas(int gas) { // gas에 값을 준다
		this.gas =gas;
	}
	
	boolean isLeftGas() { // gas가 0인지 아닌지
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() { // gas가 떨어질 때까지 소진
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.(gas잔량:"+gas+")");
				gas -= 1;
			}else {
				System.out.println("멈춥니다.(gas잔량:"+gas+")");
				break; // return 은 실행 종료
			}
		}
	}
	
	public static void main(String[]args) {
		
		Car myCar = new Car();
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요.");
		}
	}
}
