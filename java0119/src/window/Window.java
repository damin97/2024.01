package window;

import java.awt.Container;

import javax.swing.JFrame;


public class Window extends JFrame {
	
	public Window() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocation(200, 200);;
		this.setTitle("다민이의 페이지");
		
	}

	public static void main(String[] args) {
		new Window();

	}

}
