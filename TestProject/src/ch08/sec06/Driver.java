package ch08.sec06;

public class Driver extends Vehicle{
	public void deive(Vehicle vehicle) {
		// 매개변수 Vehicle는 super클래스
		vehicle.run();
	}
}