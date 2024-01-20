package Swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	public MyFrame() {
		Container con = this.getContentPane();
		con.setLayout(null);
		// 세팅에는 순서가 없다
		JButton jb1 = new JButton("button");
		jb1.setLocation(20,20);
		jb1.setSize(100, 30);
		con.add(jb1);
		
		JLabel jb2 = new JLabel("button");
		jb2.setLocation(120,20);
		jb2.setSize(100, 30);
		con.add(jb2);
		
		JTextField jt1 = new JTextField("button");
		jt1.setLocation(120,20);
		jt1.setSize(100, 30);
		con.add(jt1);
		
		this.setTitle("스윙 연습");
		this.setLocation(800, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 400); // 크기 설정
		this.setVisible(true); //윈도우 프레임을 보이게
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
}
