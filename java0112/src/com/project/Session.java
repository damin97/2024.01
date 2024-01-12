package com.project;

public class Session {
	private boolean run;
	private boolean run2;
	private LoginInfo loginInfo;
	private MenuState menuState = MenuState.TOP;
	
	
	
	public LoginInfo getLoginInfo() { // loginInfo 값을 읽는 메소드
		return loginInfo;
	}

	public void setLoginInfo(LoginInfo loginInfo) { // 메소드
		this.loginInfo = loginInfo;
	}

	public MenuState getMenuState() { // 메소드
		return menuState;
	}

	public void setMenuState(MenuState menuState) { // 메소드
		if(menuState == MenuState.DEPOSIT) {
			run2 = true;
		}else if (menuState == MenuState.TOP_EXIT) {
			run = false;
		}else if(menuState == MenuState.DEPOSIT_EXIT) {
			run2 = false;
		}
		this.menuState = menuState;
	}

	public Session(boolean run, boolean run2, LoginInfo loginInfo) { // 생성자

		this.run = run;
		this.run2 = run2;
		this.loginInfo = loginInfo;
	}

	public Session(boolean run, boolean run2) { // 생성자
		
		this.run = run;
		this.run2 = run2;
	}

	public boolean isRun() { // 메소드
		return run;
	}

	public void setRun(boolean run) { // 메소드
		this.run = run;
	}

	public boolean isRun2() { // 메소드
		return run2;
	}

	public void setRun2(boolean run2) { // 메소드
		this.run2 = run2;
	}
	
	
}
