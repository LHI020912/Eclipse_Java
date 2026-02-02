package ch06.sec04;

public class CarMain {

	public static void main(String[] args) {
		// this 참조 확인
		CarThis myCar = new CarThis("포르쉐");
		CarThis yourCar = new CarThis("벤츠");
		// this O
		myCar.run();
		yourCar.run();
		// this X
		myCar.run1();
		yourCar.run1();

	}

}
