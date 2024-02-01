package page473;

public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "member 객체 [" + id + "]";
	}
	
	@Override
	public boolean equals(Object obj) { //매개변수 다형성
		if(obj instanceof Member) {     //Member로 객체 생성이 가능한지
			Member member = (Member) obj;
			if(id.equalsIgnoreCase(member.id)) { //대소문자 가리지 않고 문자열 비교
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return id.toLowerCase().hashCode();
	}
	
	
}
