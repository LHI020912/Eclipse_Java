package ch06.sec01;

public class CarMain {

	public static void main(String[] args) {
		// 사용자 정의 클래스 Car 인스턴스 생성(생성자 함수)
		Car c= new Car();
		Car c1;
		c1=new Car();
		Car c2= new Car();
		
		// 객체속성 사용
		c.carNo="11가 1234";
		c1.carNo="22나 5678";
		c2.carNo="33다 3333";
		
		c.carMaker = "현대";
		c1.carMaker = "기아";

		// 객체메소드 사용
		c.showCarInfo();//메소드 호출
		
		//속성에 직접대입이 가능하면 속성의 값 출력도 가능
		System.out.println(c.carMaker);
	}
}