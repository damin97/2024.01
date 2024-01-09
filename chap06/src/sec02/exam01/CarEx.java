package sec02.exam01;

public class CarEx { //의미가 달라질 때 대문자로 구분

	public static void main(String[] args) {
		
		String str = "가나다"; //지역 변수는 초기화 시켜줘야 한다
		
		Car car4 = new Car("현대", "코나", "ver.1", 150);
		System.out.println(car4);
		
		Car car3 = new Car("현대자동차");
		System.out.println(car3);
		
		Car car2 = new Car(); // 기본 생성자를 호출
		System.out.println(car2);
		
		Car car = new Car();
		car.company = "KIA";
		car.color = "red";
		car.model = "K9";
		car.maxSpeed = 200;
		System.out.println(car);

	}

}
