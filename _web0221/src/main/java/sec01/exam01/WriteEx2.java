package sec01.exam01;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx2 {
	public static void main(String[] args){
		
		try (OutputStream os = new FileOutputStream("c:/temp/test3.db")){
			byte[] array = {10, 20, 30, 40, 50}; //WriteEx1.java 보다 속도가 훨씬 빠르다
			os.write(array, 1, 3); //배열로 만들어서 스트림으로 한번에 보낸다
			os.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}