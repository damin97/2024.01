package design.pattern;

//국산 생산 공장
public class KoreanCarFactory extends CarFactory {

	@Override
	public TireProduct createTire() {
		return new KoreanTireProduct();
	}

	@Override
	public DoorProduct createDoor() {
		return new KoreanDoorProduct();
	}

}
