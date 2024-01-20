package window4;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Window extends JFrame implements ActionListener {
	JLabel lb1 = new JLabel("이름1: ");
	JTextField jt1 = new JTextField(5);
	JButton bt1 = new JButton("버튼1");
	
	JLabel lb2 = new JLabel("이름2: ");
	JTextField jt2 = new JTextField(5);
	JButton bt2 = new JButton("버튼2");
	
	public Window() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		con.add(lb1);
		con.add(jt1);
		con.add(bt1);
		
		con.add(lb2);
		con.add(jt2);
		con.add(bt2);
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocation(200, 200);;
		this.setTitle("다민이의 페이지");
		bt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1");
				
			}
		});
		bt2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼2");
				
			}
		});
	}

	public static void main(String[] args) {
		new Window();

	}

	@Override
	public void actionPerformed(ActionEvent e) {	
		
	}

}
