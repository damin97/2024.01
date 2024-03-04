package sec01.exam01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx2 {

	public static void main(String[] args) {
		try (InputStream is = new FileInputStream("c:/temp/test3.db")) {
			while (true) {
				byte[] buffer = new byte[5];

				int num = is.read(buffer, 2, 3);
				if (num != -1) {
					for (int i = 0; i < buffer.length; i++) {
						System.out.println(buffer[i]);
					}
				}
//				while (true) {
//				int cnt = is.read(buffer); // 갯수를 가져온다
//				if(cnt == -1) { //파일 끝에 도달하면 반복문이 끝난다
//					break;
//				}
//				}

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
