package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class Emp { //클래스 설계 이유? <String> 여기 안에 넣기 위해서
	private int empno;
	private String ename;
	private String job;
	private double sal;
	
	public Emp(int empno, String ename, String job, double sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
}

public class JdbcArrayEx2 {

	public static void main(String[] args) {
		List<Emp> list = new ArrayList<>();
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pw = "mysql";
		Statement stmt = null; // 데이터베이스에 명령을 보내기 위해 선언
		Connection conn = null;
		String sql = "select empno, ename, job, sal from emp"; //선택한 값을 ResultSet에 넣어준다
		
		
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pw);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
//				int deptno = rs.getInt(1); //1은 첫번째 컬럼을 의미
				int empno = rs.getInt("empno"); //대체로는 이렇게 작성한다
				String ename = rs.getString("ename"); // "dname"는 컬럼명이다
				String job = rs.getString("job");
				double sal = rs.getDouble("sal");
//				String str = deptno+", "+dname+", "+loc;
//				System.out.println(deptno+", "+dname+", "+loc);
				Emp emp = new Emp(empno, ename, job, sal);
				list.add(emp); // string 대신에 객체를 넣는다
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		
		//list에 있는 자료를 모두 출력하세요. (향상된 반복문 사용)
		for(Emp emp : list) {
			System.out.println(emp.getEmpno()+"\t"+emp.getEname()+"\t"+emp.getJob()+"\t"+emp.getSal()); // 각각 불러와서 쓰는 경우가 더 많다.
		}
//		
	}

}
