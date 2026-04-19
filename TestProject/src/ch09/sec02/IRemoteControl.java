package ch09.sec02;

public interface IRemoteControl {
	// 상수필드 선언 : 멤버필드 public static final 자동 삽입
	// 필드 구성하면 static 상수로 구성됨
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상메소드 선언: abstract 생략해도 추상메소드로 자동처리
	// 메소드 원형만 표현
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// default 메소드 선언: 실행블럭이 있는 메소드(구현클래스가 소유하게되는 메소드)
	// 접근제한 생략하면 public
	default void setMute(boolean mute) {
		if(mute)
			System.out.println("무음 처리 합니다.");
		else
			System.out.println("무음 해제 합니다.");
	}
	
	// 정적 메소드 선언: 인터페이스 통해 호출되는 메소드(static)
	static void changeBattery() {
		System.out.println("건전지 교환합니다.");
	}
}
