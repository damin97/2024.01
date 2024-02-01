package swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class MyFrameSample extends JFrame {
		
		public MyFrameSample() {
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container con = this.getContentPane(); //컴포넌트 붙이는 곳
			con.setLayout(new FlowLayout());
			this.setVisible(true);
			this.setLocation(500, 400);
			this.setSize(400, 300);
			this.setTitle("이벤트");
			
		}
		
		public static void main(String[] args) {
			new MyFrameSample();
		}
	}
