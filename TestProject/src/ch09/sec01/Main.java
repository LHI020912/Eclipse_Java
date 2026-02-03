package ch09.sec01;

public class Main {

	public static void main(String[] args) {
		// 인터페이스 활용
		// 두 객체는 ISmartPhone인터페이스를 구현한 구현클래스
		SamsungPhone s = new SamsungPhone();
		s.sendCall();
		// 객체를 통한 부름
		IPhone ip = new IPhone();
		ip.sendCall();

		// 인터페이스 참조변수 : 해당 인터페이스를 구현한 구현객체를 참조가능
		// 구현메소드 사용가능
		ISmartPhone isp = new SamsungPhone();
		isp.sendCall();

		ISmartPhone iIp = new IPhone();
		iIp.sendCall();
		
		isp = new IPhone();
		iIp = new SamsungPhone();
		
	}

}
