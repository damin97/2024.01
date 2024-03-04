package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import dto.Board;
import dto.Member;

public class MemberDao {
	private static Connection conn;
	private static MemberDao dao = new MemberDao(); // 단 하나만 생성된다

	private MemberDao() {
	} // 생성자

	public static MemberDao getInstance() { // 메소드
		MemberDao.getConnection();
		return dao;
	}

	private static void getConnection() {// 외부에서 접속 불가
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Member selectForLogin(String id, String email) {
		Member member = null;
		String sql = "select * from member where id=? and email=?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, email);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				member = new Member(rs.getString("id"), rs.getString("email"), rs.getString("name"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return member;
	}

	public Member select(String id) {
		Member member = null;
		String sql = "select * from member where id=?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				member = new Member(rs.getString("id"), rs.getString("email"), rs.getString("name"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return member;
	}

	public int insert(Member member) {// 글쓰기

		String sql = "insert into member (id, email, name) values (?, ?, ?)";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getEmail());
			pstmt.setString(3, member.getName());
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}
	
	public int update(Member member) {// 글쓰기

		String sql = "update member set email=?, name=? where id=?";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(3, member.getId());
			pstmt.setString(1, member.getEmail());
			pstmt.setString(2, member.getName());
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}
	
	public HashMap<String, Member> selectMembers() {
		HashMap<String, Member> map = new HashMap<>();
		String sql = "select * from member";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Member member = new Member(rs.getString("id"), rs.getString("email"), rs.getString("name"));
				map.put(member.getId(), member);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return map;
	}
}
