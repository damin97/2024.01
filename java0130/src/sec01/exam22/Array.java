package sec01.exam22;

public class Array {

	public static void main(String[] args) {
		int[] arr = { 5, 23, 1, 43, 100, 200, 40 };
		
		for (int i = 1; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length-1; j++) {
				if (arr[i] > arr[j]) {
					int temp = 0;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
			
		}
		System.out.println("["+arr[0]+","+arr[1]+","+arr[2]+","+arr[3]+","+arr[4]+","+arr[5]+","+arr[6]+"]");
	}
}
