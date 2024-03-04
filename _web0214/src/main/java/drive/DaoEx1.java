package drive;

import java.util.List;

import dao.BoardDao;
import dto.Board;

public class DaoEx1 {

	public static void main(String[] args) {
		BoardDao dao = BoardDao.getInstance(); // 객체 불러오기
		List<Board> list = dao.selectList(); //selectList() 호출해보세요.
		// list에 들어있는 객체들을 출력해보세요.
		for(Board board : list) {
			System.out.println(board);
		}
	}

}
