package Swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test1 extends JFrame {
	public Test1() {
		Container con = this.getContentPane();
		con.setLayout(null);
		
		JTextField jt1 = new JTextField("");
		jt1.setSize(80, 40);
		jt1.setLocation(90, 50);
		con.add(jt1);
		
		JLabel jl1 = new JLabel("이름");
		jl1.setSize(80, 40);
		jl1.setLocation(50, 50);
		con.add(jl1);
		
		JTextField jt2 = new JTextField("");
		jt2.setSize(80, 40);
		jt2.setLocation(250, 50);
		con.add(jt2);
		
		JLabel jl2 = new JLabel("아이디");
		jl2.setSize(80, 40);
		jl2.setLocation(200, 50);
		con.add(jl2);
		
		JTextField jt3 = new JTextField("");
		jt3.setSize(80, 40);
		jt3.setLocation(420, 50);
		con.add(jt3);
		
		JLabel jl3 = new JLabel("패스워드");
		jl3.setSize(80, 40);
		jl3.setLocation(360, 50);
		con.add(jl3);
		
		JTextField jt4 = new JTextField("");
		jt4.setSize(80, 40);
		jt4.setLocation(590, 50);
		con.add(jt4);
		
		JLabel jl4 = new JLabel("생년월일");
		jl4.setSize(80, 40);
		jl4.setLocation(530, 50);
		con.add(jl4);
		
		JTextField jt5 = new JTextField("");
		jt5.setSize(80, 40);
		jt5.setLocation(740, 50);
		con.add(jt5);
		
		JLabel jl5 = new JLabel("전화");
		jl5.setSize(80, 40);
		jl5.setLocation(700, 50);
		con.add(jl5);
		
		JTextField jt6 = new JTextField("");
		jt6.setSize(80, 40);
		jt6.setLocation(890, 50);
		con.add(jt6);
		
		JLabel jl6 = new JLabel("잔고");
		jl6.setSize(80, 40);
		jl6.setLocation(850, 50);
		con.add(jl6);
		
		JButton jb1 = new JButton("전체내용");
		jb1.setLocation(50,400);
		jb1.setSize(100, 30);
		con.add(jb1);
		
		JButton jb2 = new JButton("입력");
		jb2.setLocation(200, 400);
		jb2.setSize(100, 30);
		con.add(jb2);
		
		JButton jb3 = new JButton("조회");
		jb3.setLocation(350, 400);
		jb3.setSize(100, 30);
		con.add(jb3);
		
		JButton jb4 = new JButton("수정");
		jb4.setLocation(500, 400);
		jb4.setSize(100, 30);
		con.add(jb4);
		
		JButton jb5 = new JButton("삭제");
		jb5.setLocation(650, 400);
		jb5.setSize(100, 30);
		con.add(jb5);
		
		JTextArea ta = new JTextArea();
		ta.setLocation(50, 100);
		ta.setSize(900, 280);
		con.add(ta);
		
		this.setTitle("Menu");
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1100, 800);
		this.setVisible(true);
		
		
		
		
	}
	public static void main(String[]args) {
		new Test1();
	}
}
