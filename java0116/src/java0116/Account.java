package java0116;

public class Account {
	private String name;
	private int balance; //은행 잔고(마이너스 통장이 아니다)
	
	public String getName() {
		return name; // 값 호출
	}
	public void setName(String name) {
		this.name = name; 
	}
	public int getBalance() {
		return balance; // 값 호출
	}
	public void setBalance(int balance) {
		if(balance > 0) { // 음수가 아니면 값을 바꾼다
			this.balance = balance; 
		}
	}
}
