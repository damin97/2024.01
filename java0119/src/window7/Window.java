package window7;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Window extends JFrame implements ActionListener {
	JLabel lb1 = new JLabel("이름1: ");
	JTextField jt1 = new JTextField(5);
	JButton bt1 = new JButton("버튼1");

	JLabel lb2 = new JLabel("이름2: ");
	JTextField jt2 = new JTextField(5);
	JButton bt2 = new JButton("종료");
	
	JLabel lbState = new JLabel("메세지를 보여 줍니다: ");
	JTextArea ta = new JTextArea(5,10);
	
	public Window() {

		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout()); // 위치를 저절로 설정해준다
		con.add(lbState);
		con.add(lb1);
		con.add(jt1);
		con.add(bt1);

		con.add(lb2);
		con.add(jt2);
		con.add(bt2);
		JScrollPane scroll = new JScrollPane(ta);
//		scroll.setSize(30, 20);
		con.add(scroll);
		
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocation(500, 200);
		;
		this.setTitle("다민이의 페이지");
		bt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1");
				lbState.setText("버튼1을 클릭했습니다.");
			}
		});
		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				confirmExit();

			}
		});
		//파일읽기 작업 처리
//		JOptionPane.showMessageDialog(this, "파일을 읽었습니다!", "파일읽기", JOptionPane.INFORMATION_MESSAGE);
	}

	public void confirmExit() {
		int answer = JOptionPane.showConfirmDialog(this, "종료하시겠습니까?", "확인", JOptionPane.YES_NO_OPTION);
		if(answer == JOptionPane.YES_OPTION) {
			System.out.println("프로그램을 종료합니다.");
			save();
			System.exit(0);
		}else {
			System.out.println("종료를 취소합니다.");
			lbState.setText("종료를 취소합니다.");
		}
	}
	
	public static void main(String[] args) {
		new Window();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
