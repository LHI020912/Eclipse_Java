package ch09.sec02;

public class RCMain {

	public static void main(String[] args) {
		// 인터페이스 참조변수 : 다형성에 해당
		IRemoteControl rc = null;
		
		// TV객체를 인터페이스 참조변수 대입
		rc = new TV();
		rc.turnOn();
		rc.setVolume(100);
		rc.setMute(true);
		rc.turnOff();
		
		TV tv = new TV();
		tv.turnOn();
		tv.setVolume(-50);
		tv.setMute(false);
		tv.setMute(true);
		tv.turnOff();
		
		// 정적메소드 사용
		IRemoteControl.changeBattery();
		
		rc = new Audio();
		rc.setMute(true);
		rc.setMute(false);
		
		// 다중 인터페이스 구현 클래스 객체를 각각 인터페이스 참조변수에 대입
		ISearchable sb = null;
		rc = new SmartTelvision();
		sb = new SmartTelvision();
		
		// 접근가능한 메소드
		// rc인터페이스에포함된 추상메소드와 default 만 접근가능
		// search()는 다른 인터페이스 추상메서드
		// rc.search("bbbb");
		sb.search("https://youtu.be/DHx_7aPZmKE?si=yJxcTHbKfFngDYiQ");
		// sb.turnOff(); // 해당 인터페이스의 추상, 디폴트 메소드만 접근 가능
		rc.setMute(false);
	}
}