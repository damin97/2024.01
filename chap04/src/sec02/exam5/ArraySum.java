package sec02.exam5;

public class ArraySum {
	
	public static int sum(int x[]) { //정적 메소드
		int s =0;
		for(int n=0; n<x.length; n++) {
			s += x[n];
		}
		return s;
	}
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int n = sum(a);
		System.out.println(n);

	}

}
