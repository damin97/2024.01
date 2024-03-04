package drive;

import java.util.List;

import dao.BoardDao;
import dto.Board;

public class DaoEx2 {

	public static void main(String[] args) {
		BoardDao dao = BoardDao.getInstance(); // 객체 불러오기
		List<Board> list = dao.selectList(); //selectList() 호출해보세요.
		// list에 들어있는 객체들을 출력해보세요.
		list.stream().forEach(s->{ //람다식은 ArrayList와 달리 유동성이 있다. 중간에 입출력 가능
			System.out.println(s.getWriter());
		});
//		for(Board board : list) {
//			System.out.println(board);
//		}
	}

}
