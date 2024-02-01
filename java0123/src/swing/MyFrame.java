package swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;



public class MyFrame extends JFrame {
	
	class MyEvent implements ActionListener { //클래스
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(tf.getText());
			
		}
	}
	String str = "안녕";
	
	JTextField tf = new JTextField(10); //필드
	JButton bt = new JButton("실행"); //필드

	public MyFrame() { //생성자
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane(); // 컴포넌트 붙이는 곳
		con.setLayout(new FlowLayout());
		this.setVisible(true);
		this.setLocation(500, 400);
		this.setSize(400, 300);
		this.setTitle("이벤트");
		con.add(tf);
		con.add(bt);
		bt.addActionListener(new MyEvent());
	}

	public static void main(String[] args) {
		new MyFrame();
	}
}
