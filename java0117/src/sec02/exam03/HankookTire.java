package sec02.exam03;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation) { //생성자
		super(location, maxRotation); //부모 생성자 호출
	}

	@Override
	public boolean roll() {
		++accumulatedRotation; //누적 회전수 1 증가
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "HankookTire 수명" + (maxRotation-accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("***" + location + "HankookTire 펑크 ***");
			return false;
		}
	}
}
