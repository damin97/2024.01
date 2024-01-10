package sec02.exam5;

public class StarPrint2 {

	public static void main(String[] args) {
		for(int i=0; i<4; i++) {
			for(int j=3; j>=0; j--) {
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}

	}

}
