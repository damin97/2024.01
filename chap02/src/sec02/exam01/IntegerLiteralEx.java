package sec02.exam01;

public class IntegerLiteralEx {

	public static void main(String[] args) {
		
		float var13 = 0.25f; // 뒤에 f,F를 붙여야 한다
		double var14 = 1.8e307; 
		System.out.println(var14);
		
		String str = "가\"나\"다";
		System.out.println(str);
		
		char var11 = '\uac00';
		int var12 = 'A';
		System.out.println(var11);  
		System.out.println(var12);
		
		long var9 = 2150000000L; // 뒤에 l,L을 붙여야 한다
//		int var10 = 2150000000;
		
		byte var1 = -128;
//		byte var2 = -129;
		byte var3 = 127;
//		byte var4 = 128;
		short var5 = -32768;
//		short var6 = -32769;
		
		int var7 = 0b10; // 2진수 계산: 2 + 0
		System.out.println(var7);
		
		int var8 = 0x16; // 16진수 계산: 16 + 6
		System.out.println(var8);
		

	}

}
