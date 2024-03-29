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
				member = new Member(rs.getInt("memberno"), rs.getString("id"), rs.getString("email"), rs.getString("name"));
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
				member = new Member(rs.getInt("memberno"), rs.getString("id"), rs.getString("email"), rs.getString("name"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return member;
	}

	public int insert(Member member) {// 글쓰기

		String sql = "insert into member (memberno, id, email, name) values (seq_member.nextval, ?, ?, ?)";

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
	
	public int delete(Member member) {

		String sql = "delete from member where memberno=?";
		String sql2 = "delete from board where memberno=?";
		
		try (PreparedStatement pstmt2 = conn.prepareStatement(sql2)) {
			pstmt2.setInt(1, member.getMemberno());
			pstmt2.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, member.getMemberno());
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}
	
	public ArrayList<Member> selectList(){
		ArrayList<Member> list = new ArrayList<>();
		
		String sql = "select * from member";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Member member = new Member(rs.getInt("memberno"), rs.getString("id"), rs.getString("email"), rs.getString("name"));
				list.add(member);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
//	public HashMap<String, Member> selectMembers() {
//		HashMap<String, Member> map = new HashMap<>();
//		String sql = "select * from member";
//		PreparedStatement pstmt;
//		try {
//			pstmt = conn.prepareStatement(sql);
//			ResultSet rs = pstmt.executeQuery();
//
//			while (rs.next()) {
//				Member member = new Member(rs.getInt("memberno"), rs.getString("id"), rs.getString("email"), rs.getString("name"));
//				map.put(member.getId(), member);
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		return map;
//	}
}
