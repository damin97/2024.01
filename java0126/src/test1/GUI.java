package test1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI extends JFrame {

	JTextField tf1 = new JTextField(5);
	JTextField tf2 = new JTextField(5);
	JTextField tf3 = new JTextField(5);
	JTextField tf4 = new JTextField(5);
	JTextField tf5 = new JTextField(5);
	JTextField tf6 = new JTextField(5);
	JTextField tf7 = new JTextField(5);
	JTextField tf8 = new JTextField(5);

	JButton bt1 = new JButton("전체내용");
	JButton bt2 = new JButton("입력");
	JButton bt3 = new JButton("사원 정보 검색");
	JButton bt4 = new JButton("수정");
	JButton bt5 = new JButton("삭제");
	JTextArea ta = new JTextArea(22, 84);
	Connection conn;
	Statement stmt;

	public GUI() {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pw = "mysql";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pw);
			stmt = conn.createStatement();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		JPanel jp1 = new JPanel(new FlowLayout());

		JLabel lb1 = new JLabel("사원번호:");
		JLabel lb2 = new JLabel("사원이름:");
		JLabel lb3 = new JLabel("직업:");
		JLabel lb4 = new JLabel("매니저번호:");
		JLabel lb5 = new JLabel("입사날짜:");
		JLabel lb6 = new JLabel("연봉:");
		JLabel lb7 = new JLabel("인센티브:");
		JLabel lb8 = new JLabel("부서번호:");

		jp1.add(bt1);
		jp1.add(bt2);
		jp1.add(bt3);
		jp1.add(bt4);
		jp1.add(bt5);

		con.add(jp1, BorderLayout.SOUTH);
		JScrollPane scroll = new JScrollPane(ta);
		JPanel jp2 = new JPanel(new FlowLayout());
		jp2.add(scroll);
		con.add(jp2, BorderLayout.CENTER);

		JPanel jp3 = new JPanel(new FlowLayout());
		con.add(jp3, BorderLayout.NORTH);
		jp3.add(lb1);
		jp3.add(tf1);
		jp3.add(lb2);
		jp3.add(tf2);
		jp3.add(lb3);
		jp3.add(tf3);
		jp3.add(lb4);
		jp3.add(tf4);
		jp3.add(lb5);
		jp3.add(tf5);
		jp3.add(lb6);
		jp3.add(tf6);
		jp3.add(lb7);
		jp3.add(tf7);
		jp3.add(lb8);
		jp3.add(tf8);

		this.setTitle("GUI");
		this.setLocation(400, 200);
		this.setSize(1000, 500);
		this.setVisible(true);

		bt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clearTextField();
				viewData();
			}
		});
		
		bt2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				insertData();
//				clearTextField();
				selectData();
			}
		});
		
		bt3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				selectData();
			}
		});
		
		bt4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				editData();
				selectData();
			}
		});
		
		bt5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				deleteData();
				viewData();
			}
		});
	}

	public void viewData() {
		try {
			String sql = String.format("select * from emp");
			ResultSet rs = stmt.executeQuery(sql);
			ta.setText("");
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				String hiredate = rs.getString("hiredate");
				double sal = rs.getDouble("sal");
				double comm = rs.getDouble("comm");
				int deptno = rs.getInt("deptno");
				String str = String.format(
						" 사원번호 : %d\t사원이름 : %s \t직업 : %-10s\t매니저번호 : %8d\t입사날짜 : %s\t연봉 : %f\t인센티브 : %f\t부서번호 : %d\n",
						empno, ename, job, mgr, hiredate, sal, comm, deptno);
				ta.append(str);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insertData() {
		
		try {
			String sql = "insert into emp values ("+tf1.getText()+", '"+tf2.getText()+"', '"+tf3.getText()+"', "+tf4.getText()+", '"+tf5.getText()+"', "+tf6.getText()+", "+tf7.getText()+", "+tf8.getText()+")";
			int result = stmt.executeUpdate(sql);
			ta.setText("");
			if(result == 1) {
				String str = String.format("입력성공!");
				ta.append(str);
			}else {
				String str = String.format("입력실패!");
				ta.append(str);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void selectData() {
		try {
			ResultSet rs = stmt.executeQuery("select * from emp where empno ="+tf1.getText());
			ta.setText("");
			if (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename"); 
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				String hiredate = rs.getString("hiredate");
				double sal = rs.getDouble("sal");
				double comm = rs.getDouble("comm");
				int deptno = rs.getInt("deptno");
				String str = String.format(
						" 사원번호 : %d\t사원이름 : %s \t직업 : %-10s\t매니저번호 : %8d\t입사날짜 : %s\t연봉 : %f\t인센티브 : %f\t부서번호 : %d\n",
						empno, ename, job, mgr, hiredate, sal, comm, deptno);
				ta.append(str);
				tf1.setText(Integer.toString(empno)); tf2.setText(ename); tf3.setText(job); tf4.setText(Integer.toString(mgr)); tf5.setText(hiredate); tf6.setText(Double.toString(sal)); tf7.setText(Double.toString(comm)); tf8.setText(Integer.toString(deptno)); 
			} else {
				String str = String.format("유효하지 않은 사원번호입니다.\n");
				ta.append(str);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void editData() {
		
		try {
			String sql = "update emp set empno = "+tf1.getText()+", ename = '"+tf2.getText()+"', job = '"+tf3.getText()+"', mgr = "+tf4.getText()+", hiredate = '"+tf5.getText()+"', sal = "+tf6.getText()+", comm = "+tf7.getText()+", deptno = "+tf8.getText()+" where empno ="+tf1.getText();
			int result = stmt.executeUpdate(sql);
			if(result >= 1) {
				String str = String.format("수정성공!");
			}else {
				String str = String.format("수정실패!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void deleteData() {
		
		try {
			String sql = "delete from emp where empno = "+"'"+tf1.getText()+"'";
			int result = stmt.executeUpdate(sql);
			clearTextField();
			if(result >= 1) {
				String str = String.format("삭제성공!");
			}else {
				String str = String.format("삭제실패!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
	}
	
	public void clearTextField() {
		tf1.setText(""); tf2.setText(""); tf3.setText(""); tf4.setText(""); tf5.setText(""); tf6.setText(""); tf7.setText(""); tf8.setText("");
	}

	public static void main(String[] args) {
		new GUI();

	}
}
