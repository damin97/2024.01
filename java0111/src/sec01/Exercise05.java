package sec01;

public class Exercise05 {

	public static void main(String[] args) {
		int[][]array = {{95,86},{83, 92, 96},{78,83,93,87,88}};
		
		int sum =0;
		double avg = 0.0;
		int count=0;
		
		for(int[] num :array) {
			for(int num2: num) {
				sum += num2;
				count++;
			}
		}
		avg = (double)sum / count;
		
		System.out.println("sum: "+sum);
		System.out.println("avg: "+avg);

	}
}
