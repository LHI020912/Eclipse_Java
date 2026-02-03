package ch09.sec01;

// 인터페이스 구현 클래스에 오버라이딩하는 메소드 원형 추가
//: 메뉴 source - 
public class SamsungPhone implements ISmartPhone{
	String name;
	
	public SamsungPhone() {
		name="삼성폰";
	}

	@Override
	public void sendCall() {
		System.out.println(name+"으로 전화를 겁니다");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveSMS() {
		// TODO Auto-generated method stub
		
	}

}
