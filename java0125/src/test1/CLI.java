package test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CLI {
	private static String url = "jdbc:mysql://localhost:3306/firm";
	private static String id = "root";
	private static String pw = "mysql";
	static Scanner scanner = new Scanner(System.in);
	
	private static void viewData(Connection conn) throws SQLException {

		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from emp");

		while (rs.next()) {
			int empno = rs.getInt("empno");
			String ename = rs.getString("ename"); 
			String job = rs.getString("job");
			int mgr = rs.getInt("mgr");
			String hiredate = rs.getString("hiredate");
			double sal = rs.getDouble("sal");
			double comm = rs.getDouble("comm");
			int deptno = rs.getInt("deptno");
			System.out.printf(" empno : %d\tename : %s\tjob : %s\t  mgr : %d\thiredate : %s\tsal : %f\tcomm : %f \tdeptno : %d", empno, ename, job, mgr, hiredate, sal, comm, deptno);
			System.out.println();
		}

//		conn.close();
	}

	private static void insertData(Connection conn) throws SQLException {
		
		System.out.print("사원번호:");
		int empno = Integer.parseInt(scanner.nextLine());
		System.out.print("사원이름:");
		String ename = scanner.nextLine();
		System.out.print("직업:");
		String job = scanner.nextLine();
		System.out.print("매니저번호:");
		int mgr = Integer.parseInt(scanner.nextLine());
		System.out.print("입사날짜:");
		String hiredate = scanner.nextLine();
		System.out.print("연봉:");
		double sal = Double.parseDouble(scanner.nextLine());
		System.out.print("인센티브:");
		double comm = Double.parseDouble(scanner.nextLine());
		System.out.print("부서번호:");
		int deptno = Integer.parseInt(scanner.nextLine());
		
		Statement stmt = conn.createStatement();
		String sql = "insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) values ("+empno+", '"+ename+"', '"+job+"', "+mgr+", '"+hiredate+"', "+sal+", "+comm+", "+deptno+")";
		int result = stmt.executeUpdate(sql);
		
		if(result == 1) {
			System.out.println("입력성공!");
		}else {
			System.out.println("입력실패!");
		}
		System.out.println();
	}
	
	private static void deleteData(Connection conn) throws SQLException {
		
		Statement stmt = conn.createStatement();
		
		System.out.print("삭제할 사원이름을 적어주세요: ");
		String ename = scanner.nextLine();
		String sql = "delete from emp where ename = "+"'"+ename+"'";
		int result = stmt.executeUpdate(sql);		
		if(result >= 1) {
			System.out.println("삭제성공!");
		}else {
			System.out.println("삭제실패!");
		}
	}
	
	private static void selectData(Connection conn) {
		System.out.print("사원번호를 입력해주세요: ");
		int empno = Integer.parseInt(scanner.nextLine());
		Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp where empno ="+empno);
			
			if (rs.next()) {
				empno = rs.getInt("empno");
				String ename = rs.getString("ename"); 
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				String hiredate = rs.getString("hiredate");
				double sal = rs.getDouble("sal");
				double comm = rs.getDouble("comm");
				int deptno = rs.getInt("deptno");
				System.out.printf(" empno : %d\tename : %s\tjob : %s\t  mgr : %d\thiredate : %s\tsal : %f\tcomm : %f \tdeptno : %d", empno, ename, job, mgr, hiredate, sal, comm, deptno);
				System.out.println();
				
			} else {
				System.out.println("유효하지 않은 사원번호입니다.\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	private static void editData(Connection conn) throws SQLException {

		Statement stmt = conn.createStatement();
		
		System.out.print("수정할 사원번호를 작성해주세요: ");
		int empno = Integer.parseInt(scanner.nextLine());
		System.out.print("사원이름:");
		String ename = scanner.nextLine();
		System.out.print("직업:");
		String job = scanner.nextLine();
		System.out.print("매니저번호:");
		int mgr = Integer.parseInt(scanner.nextLine());
		System.out.print("입사날짜:");
		String hiredate = scanner.nextLine();
		System.out.print("연봉:");
		double sal = Double.parseDouble(scanner.nextLine());
		System.out.print("인센티브:");
		double comm = Double.parseDouble(scanner.nextLine());
		System.out.print("부서번호:");
		int deptno = Integer.parseInt(scanner.nextLine());
		
		String sql = "update emp set ename = '"+ename+"', job = '"+job+"', mgr = "+mgr+", hiredate = '"+hiredate+"', sal = "+sal+", comm = "+comm+", deptno = "+deptno+" where empno ="+empno;
		int result = stmt.executeUpdate(sql);
		System.out.println(result);
		if(result >= 1) {
			System.out.println("수정성공!" + result);
		}else {
			System.out.println("수정실패!" + result);
		}
	}

	public static void main(String[] args) {
		try (Connection conn = DriverManager.getConnection(url, id, pw)) {
			
			boolean exit = true;

			while (exit) {
				System.out.println("------------------------------------------------------------------------");
				System.out.println("1.전체 데이터 보기 | 2.데이터 삽입 | 3.데이터 삭제 | 4.데이터 수정 | 5.사원 데이터 보기 | 6.종료");
				System.out.println("------------------------------------------------------------------------");
				System.out.print("메뉴를 선택해주세요: ");
				int num = Integer.parseInt(scanner.nextLine());

				switch (num) {
				case 1:
					viewData(conn);
					break;
				case 2:
					insertData(conn);
					break;
				case 3:
					deleteData(conn);
					break;
				case 4:
					editData(conn);
					break;
				case 5:
					selectData(conn);
					break;
				case 6:
					System.out.println("프로그램을 종료합니다.");
					exit = false;
					break;
				default :
					System.err.println("다시 선택해주세요.");
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
