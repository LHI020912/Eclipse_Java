package ch08.sec05;

public class SportsCar extends MyCar {

	@Override
	public void speedUp() {
		speed +=10;
	}

	/*final 메소드는 재정의 불가
	@Override
	public void stop() {
		System.out.println("스포츠차를 멈춤");
		speed = 0;
	}
	*/
}
