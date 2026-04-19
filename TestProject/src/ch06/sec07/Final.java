package ch06.sec07;

public class Final {
	final String nation = "Korea"; //객체 생성 시 고정됨
	final String ssn;// 생성될 때 부여 (만들 때 초기화)
	String name;
	
	public Final(String name, String ssn) {
		this.ssn = ssn; // 상수 초기화
		this.name = name;
	}
}
