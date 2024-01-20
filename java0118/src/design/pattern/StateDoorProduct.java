package design.pattern;

// 미국산 차 문 제작
public class StateDoorProduct extends DoorProduct {

	@Override
	public String makeAssemble() {
		return "미국산 차 문";
	}
}
