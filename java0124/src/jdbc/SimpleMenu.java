package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class SimpleMenu{

    private static final String DB_URL = "jdbc:mysql://localhost:3306/firm";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "mysql";
    static Scanner scanner = new Scanner(System.in);
  
    
    public static void main(String[] args) {
    	
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            
            boolean exit = false;

            while (!exit) {
                System.out.println("1. 데이터 보기");
                System.out.println("2. 데이터 삽입");
                System.out.println("3. 종료");
                System.out.print("선택하세요: ");

                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        viewData(connection);
                        break;
                    case 2:
                        insertData(connection);
                        break;
                    case 3:
                        exit = true;
                        break;
                    default:
                        System.out.println("유효하지 않은 선택. 다시 시도하세요.");
                        break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void viewData(Connection connection) throws SQLException {
    	Statement stmt = connection.createStatement(); //메소드 사용하려고 변수 선언하는 것이다
		ResultSet rs = stmt.executeQuery("select deptno, dname, loc from dept"); 
		while(rs.next()) { // next() 는 다음 단계로 이동을 의미한다
			int deptno = rs.getInt("deptno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.printf("%d, %s, %s\n", deptno, dname, loc);
		}
		System.out.println();
//		connection.close();
    }

    private static void insertData(Connection connection) throws SQLException {
    	System.out.print("부서번호:");
		int deptno = Integer.parseInt(scanner.nextLine());
		System.out.print("부서이름:");
		String dname = scanner.nextLine();
		System.out.print("부서위치:");
		String loc = scanner.nextLine();
		
		Statement stmt = connection.createStatement();
		String sql = "insert into dept(deptno, dname, loc) values ("+deptno+", '"+dname+"', '"+loc+"')";
		int result = stmt.executeUpdate(sql);
		
		if(result == 1) {
			System.out.println("입력성공!");
		}else {
			System.out.println("입력실패!");
		}
		System.out.println();
    }
}