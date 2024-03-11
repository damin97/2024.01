package practice;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberRegisterService {
//	@Autowired //객체를 넣어주는 역할을 한다, 타입을 보고 객체를 넣어주므로 변수명은 상관이 없다
	private MemberDao memberDao;
	
	@Autowired //생성자에는 넣지 않는다
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public void regist() {
		memberDao.process();
		if(memberDao == null) {
			System.out.println("memberDao가 null입니다.");
		}
		System.out.println("regist()");
	}
}
