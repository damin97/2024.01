package sec01;

public class Array1 {

	public static void main(String[] args) {
		
		int a[]= {1,3,10,2,8};
		int max =0;
		int sum =0;
		double avg =0.0;
		
		for(int i=0; i<a.length; i++) {
			if(max<a[i]) {
				max = a[i];
			}
			sum += a[i];
		}
		avg = (double)sum / a.length;
		System.out.println("합계: "+sum);
		System.out.println("평균: "+avg);
		System.out.println("최대값: "+max);
	}

}
