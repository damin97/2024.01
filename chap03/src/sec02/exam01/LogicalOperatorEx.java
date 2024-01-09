package sec02.exam01;

public class LogicalOperatorEx {

	public static void main(String[] args) {
		
		int charCode = 'a';
		
		if((charCode>=65)&(charCode<=90)) { // &는 두개 모두 계산
			System.out.println("대문자군요");
		}
		
		if((charCode>=97)&&(charCode<=122)) { // 개발할때는 &보다는 &&을 쓴다, &&는 첫번째꺼가 거짓이면 뒤에거는 계산 안한다
			System.out.println("소문자군요");
		}
		
		if(!(charCode>=48)&&!(charCode<=57)) {
			System.out.println("0~9 숫자군요");
		}
		
		int value = 6;
		
		if((value%2==0)|(value%3==0)) {
			System.out.println("2 또는 3의 배수군요");
		}
		
		if((value%2==0)||(value%3==0)) {
			System.out.println("2 또는 3의 배수군요");
		}
	}
}
