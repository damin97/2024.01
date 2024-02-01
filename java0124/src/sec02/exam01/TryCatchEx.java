package sec02.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryCatchEx {

	public static void main(String[] args) throws ClassNotFoundException {
//		String str; //앞에 java.lang.이 생략된 것
		
		try{
			//예외가 발생할 수 있는 코드
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			//예외 처리 코드 작성 부분
			System.out.println("클래스가 존재하지 않음!");
			System.exit(0);
//			e.printStackTrace();
		} finally {
			System.out.println("반드시 실행");
		}
		
		try {
			Connection conn = DriverManager.getConnection(null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
