package sec02.exam01;

public class ContinueEx3 {

	public static void main(String[] args) {
		
		Loop: for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(i == 3 && j == 3) {
					continue Loop;
				}
				System.out.printf("(%d, %d)\n", i, j);
			}
		}

	}

}
