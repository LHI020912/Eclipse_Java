package ch11.sec01;

// 해당 클래스는 Object객체를 다루는 필드와 메소드
public class Box {
	// 필드선언 : 타입결정 되어있지 않음
	// 모든 타입을 표현하는 타입(객체): 자바Object를 상속 받아 구성
	// 기본 데이터 타입도 Object가 포함
	private Object object;

	public void set(Object object) {
		this.object = object;
	}
	public Object get() {
		return object;
	}
}
