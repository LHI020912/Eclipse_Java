package ch06.sec06;

public class Singleton {
	//클래스 멤버필드 생성(static 생성)
	//Singleton 참조변수 : 객체생성 되어있음. 클래스명을 통해 접근가능
	private static Singleton singleton = new Singleton();
	//new연산자에 의해 한 번만 실행됨
	// 클래스내부에서 객체 인스턴스 하나 생성
	
	// 필드보호를 위해서 private으로 접근 제한

	//생성자 함수:Singleton 패턴을 활용할 예정 -> 객체인스턴스를 한개만 유지
	//private이므로 외부 접근 불가능(생성자 함수1개) - 클래스 내부 접근가능
	private Singleton() {
		
	}
	
	static Singleton getInstance() {
		return singleton;
	}
}
