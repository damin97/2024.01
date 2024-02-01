package page446;

public class ArrayOutOfBound {

	public static void main(String[] args) {
		int[] arr = new int[4];
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr[4]);
	}

}
