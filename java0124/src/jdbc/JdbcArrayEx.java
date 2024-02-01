package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class Dept { //클래스 설계 이유? <String> 여기 안에 넣기 위해서
	private int deptno;
	private String dname;
	private String loc;
	
	public Dept(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}

public class JdbcArrayEx {

	public static void main(String[] args) {
		List<Dept> list = new ArrayList<>();
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pw = "mysql";
		Statement stmt = null; // 데이터베이스에 명령을 보내기 위해 선언
		Connection conn = null;
		String sql = "select deptno, dname, loc from dept"; //선택한 값을 ResultSet에 넣어준다
		
		
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pw);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
//				int deptno = rs.getInt(1); //1은 첫번째 컬럼을 의미
				int deptno = rs.getInt("deptno"); //대체로는 이렇게 작성한다
				String dname = rs.getString("dname"); // "dname"는 컬럼명이다
				String loc = rs.getString("loc");
//				String str = deptno+", "+dname+", "+loc;
//				System.out.println(deptno+", "+dname+", "+loc);
				Dept dept = new Dept(deptno, dname, loc);
				list.add(dept); // string 대신에 객체를 넣는다
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(list);
		//list에 있는 자료를 모두 출력하세요. (향상된 반복문 사용)
		for(Dept dept : list) {
			System.out.println(dept.getDeptno()+"\t"+dept.getDname()+"\t"+dept.getLoc()); // 각각 불러와서 쓰는 경우가 더 많다.
		}
//		for(Dept dept : list) {
//			System.out.println(dept); // 자료를 모두 불러온다.
//		}
		
	}

}
