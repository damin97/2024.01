package chap05;

public class Exam05 {

	public static void main(String[] args) {
		
		double[]array = new double[] {83.6,90.0,87.2};
		double sum=0;
		double avg;
		//총점과 평균
//		for(int i=0; i<array.length; i++) {
//			sum += array[i];
//		}
		for(double num: array) {
			sum+=num;
		}
		System.out.println("총점: " + sum);
		
		avg = (double)sum/array.length;
		System.out.println("평균: " + avg);
		
	}

}
