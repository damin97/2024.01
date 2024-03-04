package sec01.exam01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx {

	public static void main(String[] args) {
		try (InputStream is = new FileInputStream("c:/temp/test1.db")){
			while(true) {
				int data = is.read();
				if(data == -1) { //파일 끝에 도달하면 반복문이 끝난다
					break;
				}
				System.out.println(data);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
