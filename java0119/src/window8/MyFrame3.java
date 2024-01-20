package window8;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame3 extends JFrame implements ActionListener {
	List<Account> list = new ArrayList<>();
	int index = 0;
	JButton jb1 = new JButton("전체내용");
	JButton jb2 = new JButton("입력");
	JButton jb3 = new JButton("조회");
	JButton jb4 = new JButton("수정");
	JButton jb5 = new JButton("삭제");
	JButton jb6 = new JButton("종료");

	JTextField jt1 = new JTextField();
	JTextField jt2 = new JTextField();
	JTextField jt3 = new JTextField();
	JTextField jt4 = new JTextField();
	JTextField jt5 = new JTextField();
	JTextField jt6 = new JTextField();
	JLabel lb7 = new JLabel("메세지 나오나요? 상태 메세지!");
	JTextArea ta = new JTextArea();

	public MyFrame3() throws ClassNotFoundException, IOException {
		load();
		Container con = this.getContentPane();
		con.setLayout(null);

		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		jb6.addActionListener(this);

		con.add(lb7);
		lb7.setLocation(20, 420);
		lb7.setSize(400, 30);

		JLabel lb1 = new JLabel("이름");
		con.add(lb1);
		lb1.setLocation(20, 50);
		lb1.setSize(100, 30);

		con.add(jt1);
		jt1.setLocation(50, 50);
		jt1.setSize(100, 30);

		JLabel lb2 = new JLabel("아이디");
		con.add(lb2);
		lb2.setLocation(200, 50);
		lb2.setSize(100, 30);

		con.add(jt2);
		jt2.setLocation(250, 50);
		jt2.setSize(100, 30);

		JLabel lb3 = new JLabel("패스워드");
		con.add(lb3);
		lb3.setLocation(400, 50);
		lb3.setSize(100, 30);

		con.add(jt3);
		jt3.setLocation(460, 50);
		jt3.setSize(100, 30);

		JLabel lb4 = new JLabel("생년월일");
		con.add(lb4);
		lb4.setLocation(620, 50);
		lb4.setSize(100, 30);

		con.add(jt4);
		jt4.setLocation(680, 50);
		jt4.setSize(100, 30);

		JLabel lb5 = new JLabel("전화");
		con.add(lb5);
		lb5.setLocation(20, 80);
		lb5.setSize(100, 30);

		con.add(jt5);
		jt5.setLocation(50, 80);
		jt5.setSize(100, 30);

		JLabel lb6 = new JLabel("잔고");
		con.add(lb6);
		lb6.setLocation(200, 80);
		lb6.setSize(100, 30);

		con.add(jt6);
		jt6.setLocation(250, 80);
		jt6.setSize(100, 30);

		jb1.setLocation(20, 350);
		jb1.setSize(100, 30);
		con.add(jb1);

		jb2.setLocation(200, 350);
		jb2.setSize(100, 30);
		con.add(jb2);

		jb3.setLocation(380, 350);
		jb3.setSize(100, 30);
		con.add(jb3);

		jb4.setLocation(560, 350);
		jb4.setSize(100, 30);
		con.add(jb4);

		jb5.setLocation(740, 350);
		jb5.setSize(100, 30);
		con.add(jb5);

		jb6.setLocation(20, 400);
		jb6.setSize(100, 30);
		con.add(jb6);

//		JTextArea ta = new JTextArea();
//		ta.setLocation(20, 120);
//		ta.setSize(830, 200);
//		con.add(ta);
		JScrollPane scroll = new JScrollPane(ta);
		scroll.setLocation(20, 120);
		scroll.setSize(830, 200);
		con.add(scroll);

		this.setLocation(200, 100);
		this.setTitle("스윙 연습");
		this.setVisible(true); // 윈도우 프레임을 보이게
		this.setSize(900, 500); // 크기 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void save() throws IOException {
		FileOutputStream fos = new FileOutputStream("c:/temp/swing.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.flush();
		oos.close();
	}

	public void load() throws IOException, ClassNotFoundException {
		// 파일 읽어오기
		String folderPath = "c:\\temp";
		String fileName = "swing.db";

		Path folder = Paths.get(folderPath);
		Path filePath = folder.resolve(fileName);

		if (Files.exists(filePath)) {
			FileInputStream fis = new FileInputStream("c:/temp/swing.db");
			ObjectInputStream ois = new ObjectInputStream(fis);
			this.list = (List) ois.readObject();
		}
	}

	public void confirmExit() throws IOException {
		int answer = JOptionPane.showConfirmDialog(this, "종료하시겠습니까?", "확인", JOptionPane.YES_NO_OPTION);
		if (answer == JOptionPane.YES_OPTION) {
			System.out.println("프로그램을 종료합니다.");
			save();
			System.exit(0);
		} else {
			System.out.println("종료를 취소합니다.");
			lb7.setText("종료를 취소합니다.");
		}
	}

	public static void main(String... ar) throws ClassNotFoundException, IOException {

		new MyFrame3();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String name;
		String id;
		String pw;
		String tel;
		String ssn;
		int balance;

//		System.out.println(e.getActionCommand());
		switch (e.getActionCommand()) {
		case "전체내용":
			ta.setText("");
			lb7.setText("전체내용 나오기");
			for (Account acc : list) {
				ta.append(acc.toString());
				ta.append("\n");
			}
//			System.out.println("전체내용: ");
//			for(Account account : list) {
//				System.out.println(account);
//			}
			break;
		case "입력":
//			System.out.println("입력 실행");
//			System.out.printf("%s,%s,%s,%s,%s,%s\n", jt1.getText(), jt2.getText(), jt3.getText(), jt4.getText(), jt5.getText(), jt6.getText());
//			list.add(new Account(jt1.getText(), jt2.getText(), jt3.getText(), jt4.getText(), jt5.getText(), jt6.getText()));
			name = jt1.getText();
			id = jt2.getText();
			pw = jt3.getText();
			tel = jt4.getText();
			ssn = jt5.getText();
			balance = Integer.parseInt(jt6.getText());
			Account acc = new Account(name, id, pw, tel, ssn, balance);
			list.add(acc);
//			list.add(new Account(name, id, pw, tel, ssn, balance));
//			String str = String.format("%s,%s,%s,%s,%s,%d", name, id, pw, tel, ssn, balance);
//			lb7.setText(str);
			lb7.setText(acc.toString());
			break;
		case "조회":
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getName().equals(jt1.getText())) {
					jt2.setText(list.get(i).getId());
					jt3.setText(list.get(i).getPw());
					jt4.setText(list.get(i).getTel());
					jt5.setText(list.get(i).getSsn());
					jt6.setText(String.valueOf(list.get(i).getBalance()));
					ta.setText(list.get(i).getName() + "회원님의 정보를 조회합니다.");
					ta.append(list.get(i).toString());
					ta.append("\n");
					index = i;
				}
			}
			break;
		case "수정":

			lb7.setText("입력하신 정보를 바탕으로 회원 정보를 수정합니다");

			list.get(index).setName(jt1.getText());
			list.get(index).setId(jt2.getText());
			list.get(index).setPw(jt3.getText());
			list.get(index).setSsn(jt4.getText());
			list.get(index).setTel(jt5.getText());
			list.get(index).setBalance(Integer.parseInt(jt6.getText()));

			lb7.setText("수정이 완료되었습니다");
//			System.out.println("전체내용: ");
//			for(Account account : list) {
//				System.out.println(account);
//			}
			break;

		case "삭제":
			ta.setText("정보를 삭제합니다.");
			list.remove(index);
			// ta.append(list.get);

			break;

		case "종료":
			try {
				confirmExit();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		default:
			break;
		}

	}
}