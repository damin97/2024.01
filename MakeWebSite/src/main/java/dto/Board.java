package dto;

public class Board {
	private int num;
	private String name;
	private String title;
	private String content;
	private String regtime;
	private int hits;
	private int memberno;
	
	public Board() {}
	
	
	
	public Board(String name, String title, String content) {
		super();
		this.name = name;
		this.title = title;
		this.content = content;
	}

	

	public Board(int num, String name, String title, String content) {
		super();
		this.num = num;
		this.name = name;
		this.title = title;
		this.content = content;
	}



	public Board(int num, String title, String content, String regtime, int hits) {
		super();
		this.num = num;
		this.title = title;
		this.content = content;
		this.regtime = regtime;
		this.hits = hits;
	}

	public Board(int num, String name, String title, String content, String regtime, int hits) {
		super();
		this.num = num;
		this.name = name;
		this.title = title;
		this.content = content;
		this.regtime = regtime;
		this.hits = hits;
	}

	public Board(int num, String title, String content, String regtime, int hits, int memberno) {
		super();
		this.num = num;
		this.title = title;
		this.content = content;
		this.regtime = regtime;
		this.hits = hits;
		this.memberno = memberno;
	}



	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public String getRegtime() {
		return regtime;
	}



	public void setRegtime(String regtime) {
		this.regtime = regtime;
	}



	public int getHits() {
		return hits;
	}



	public void setHits(int hits) {
		this.hits = hits;
	}



	public int getMemberno() {
		return memberno;
	}



	public void setMemberno(int memberno) {
		this.memberno = memberno;
	}



	@Override
	public String toString() {
		return "Board [num=" + num + ", name=" + name + ", title=" + title + ", content=" + content + ", regtime="
				+ regtime + ", hits=" + hits + ", memberno=" + memberno + "]";
	}

	
}
