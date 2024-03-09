package spring;

import java.util.Collection;

public class MemberListPrinter { //서비스에 해당
	private MemberDao memberDao;
	private MemberPrinter printer;
	
	public MemberListPrinter(MemberDao memberDao, MemberPrinter printer) {
		this.memberDao = memberDao;
		this.printer = printer;
	}
	
	public void printAll() {
		Collection<Member> members = memberDao.selectAll();
//		members.stream().forEach(a->{//람다식으로 아래와 같은 기능
//			printer.print(a);
//		});
		members.forEach(m->printer.print(m)); //반복문 돌려서 각각 프린트
//		for(Member member : members) { //위랑 같은 기능
//			printer.print(member);
//		}
	}
}
