package sec02.exam01;

public class BreakEx {

	public static void main(String[] args) {

		for (int i=0; i<100; i++) {
			if(i ==55) {
//				break; //루프를 탈출
				continue; //루프 시작시점으로 이동
			}
			System.out.println(i);
		}
		System.out.println("종료");
	}
}
