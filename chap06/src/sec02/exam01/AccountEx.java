package sec02.exam01;

public class AccountEx {

	public static void main(String[] args) {
		
		Account acc = new Account();
		acc.name = "김다민";
		acc.ssn = "970114";
		acc.tel = "01028962448";
		System.out.println(acc);
		System.out.println(acc.name);
		
		Account acc1 = new Account("김다민", "970114", "01028962448", 27);
		System.out.println(acc1);

	}

}
