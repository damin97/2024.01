package sec03.exam01;

public class Sum {

	public static void main(String[] args) {
		
		int sum=0;
		int start =1;
		int end = 10;
		
		for(int i=start; i<=end; i++) {
			System.out.println("i:"+i);
			sum += i;//sum=sum+i; 와 같다
			System.out.println(sum);
		}
		System.out.println(start+"부터 "+end+"까지의 합계:"+sum);
		
	}

}
