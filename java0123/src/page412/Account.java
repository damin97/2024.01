package page412;

public class Account {
	Name name = new Name();
	static School school = new Account().new School();
	
	class Name {}
	class School {}
}
