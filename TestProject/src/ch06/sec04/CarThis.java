package ch06.sec04;

public class CarThis {
	//멤버필드
	String model;
	int speed;
	//생성자 함수
	CarThis(String model){
	//생성자의 블럭을 벗어나 클래스 객체가 가지고있는 model 변수를 참조해란 의미
	// 밖에있는 얘 전체 상위를 참조해!
		this.model = model;//this 현재 클래스 자체의미 CarThis를 참조하게 함	
	}
	
	//메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//클래스 메소드에서 현재 클래스 this 참조 사용
	void run() {
		for(int i=10; i<=50;i+=10) {
			this.setSpeed(i);
			System.out.println(this.model +
					"가 달립니다.(시속: "+this.speed+"km/h)");
		}
	}
	
	// this 참조 없이 이름만
	// this 참조 없이 구별이 불가능할 때 사용
	void run1() {
		for(int i=10; i<=50;i+=10) {
			setSpeed(i);
			System.out.println(model +
					"가 달립니다.(시속: "+speed+"km/h)");
		}
	}
}
