package sec01;

public class Array4 {
	
	public static void print(int a[]) {
		for(int n: a) {
			System.out.print(n+",");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int a[]= {10,2,6,1};
		
		print(a);
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-1; j++) {
				if(a[j]>a[j+1]) {
					int swap = a[j];
					a[j]=a[j+1];
					a[j+1]=swap;
							
					print(a);
				}
			}
		}
		print(a);
	}
}
