package ch06.sec01;

public class Car {
	//클래스의 구성요소
	//멤버필드(속성):객체를 표현하는 정보저장
	String carNo;
	String carName;
	String carMaker;
	int carYear;
	int carCC;
	
	//멤버메소듸:객체의 기능을 표현
	//자동차 정보를 출력하는 메소드
	public void showCarInfo() {
		System.out.println("차량 번호 : "+carNo);
	}
}
