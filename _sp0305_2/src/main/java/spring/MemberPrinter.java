package spring;

public class MemberPrinter {
	public void print(Member member) { //println과 비슷한 기능
		System.out.printf(
				"회원정보: 아이디=%d, 이메일=%s, 이름=%s, 등록일=%tF\n",
				member.getId(), member.getEmail(), member.getName(), member.getRegisterDateTime());
	}
}
