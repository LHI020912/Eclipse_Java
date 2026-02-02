package ch06.sec05;

public class CalculaterMain {

	public static void main(String[] args) {
		// static 활용
		double result1 = Calculator.pi *10 *10;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);

		System.out.println(result1+", "+result2+", "+result3);
	}
}