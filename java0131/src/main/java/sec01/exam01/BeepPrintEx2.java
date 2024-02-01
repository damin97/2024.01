package sec01.exam01;

public class BeepPrintEx2 {

	public static void main(String[] args) {
		Thread th = new Thread(new BeepTask());
		th.start(); //run 메소드는 프로그램이 알아서 실행, start();로 해야지 멀티 스레드이다
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);  //잠시 멈춤 500은 0.5초를 의미
			} catch (InterruptedException e) {
				
			}
		}
		System.out.println("main 종료");
	}

}
