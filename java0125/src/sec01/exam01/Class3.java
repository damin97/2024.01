package sec01.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Class3 {
	
	void method() {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		String sql = "select * from emp";
//		Connection conn = null;
//		Statement stmt = null;
//		ResultSet rs = null;
//		
		
		try (Connection conn = DriverManager.getConnection(url, id, pass);
			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery(sql);
			){
			
			while (rs.next()) {
				System.out.print(rs.getInt("empno") + "\t");
				System.out.print(rs.getString("ename") + "\t");
				System.out.println(rs.getDouble("sal"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static void main(String[] args) {
		Class3 class3 = new Class3();
		class3.method();
//		method(); static으로 선언 시 가능
	}

}
