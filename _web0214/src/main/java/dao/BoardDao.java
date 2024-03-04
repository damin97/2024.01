package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import dto.Board;

public class BoardDao { // 싱글턴은 객체를 단 하나만 생성하겠다는 의미
	private static Connection conn;
	private static BoardDao dao = new BoardDao(); // 단 하나만 생성된다

	private BoardDao() {
	} // 생성자

	public static BoardDao getInstance() { // 메소드
		BoardDao.getConnection();
		return dao;
	}

	private static void getConnection() {// 외부에서 접속 불가
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "mysql");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<Board> selectList() {
		ArrayList<Board> list = new ArrayList<Board>();
		String sql = "select * from board order by num desc";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Board board = new Board(rs.getInt("num"), rs.getString("writer"), rs.getString("title"),
						rs.getString("content"), rs.getString("regtime"), rs.getInt("hits"));
				list.add(board);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	public Board selectOne(int num, boolean inc) {
		Board board = null;
		String sql = "select * from board where num=?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				board = new Board(rs.getInt("num"), rs.getString("writer"), rs.getString("title"),
						rs.getString("content"), rs.getString("regtime"), rs.getInt("hits"));
				
			}
			if(inc) {
				pstmt.executeUpdate("update board set hits = hits+1 where num="+num);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return board;
	}
	
	public int delete(int num) {
		int res = 0;
		String sql = "delete from board where num=?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			res = pstmt.executeUpdate();
			
			if(res > 0) {
				System.out.println("삭제 성공");
				
			}else {
				System.out.println("삭제 실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}
	
	public int insert(Board board) {//글쓰기
		int res = 0;
        String sql = "insert into board (writer, title, content, regtime, hits) values (?, ?, ?, ?, 0)";
		
		try (PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, board.getWriter());
	        pstmt.setString(2, board.getTitle());
	        pstmt.setString(3, board.getContent());
	        pstmt.setString(4, board.getRegtime());
	        
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return res;
	}
	
	public int update(Board board) {//수정
		return 0;
	}
}