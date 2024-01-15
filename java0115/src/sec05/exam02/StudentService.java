package sec05.exam02;

public class StudentService {
	Student student = new Student();
	private static StudentService StudentService = new StudentService(); //싱글톤 필드 선언
	
	private StudentService() {
		
	}
	
	public static StudentService getInstance() {
		return StudentService;
	}

}
