package ch06.sec04;

public class BookMain {

	public static void main(String[] args) {
		//this() 연습
		BookThisMethod book = new BookThisMethod();
		book = new BookThisMethod("java","양정원");
		book = new BookThisMethod("java script",19000);
	}
}