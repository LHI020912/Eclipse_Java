package ch03.sec01;

public class OverflowEx {

	public static void main(String[] args) {
		// 산술연산자 사용시 주의할 점
		// 결과값 산출 시 overflow 주의

		int x= 1000000; //백만
		int y= 1000000; //백만
		
		int z = x * y;
		//1000000000000 -> int범위 벗어남
		long l = (long)x * (long)y;
		// 강제 형변환 없이 진행하면 결과가 int타입이어서 long에 넣어도 동일한 결과

		System.out.println(z);
		System.out.println(l);
		
		//NaN과 Infinity 주의
		// /(나누기)연산과 %연산시 주의
		// System.out.println(10 / 0);	// 정수 0으로 나눌 경우 예외 발생
		System.out.println(10 / 0.0);	//실수0.0으로 나눌경우 Infinity출력
		
		// System.out.println(10 % 0); /// by zero
		System.out.println(10 % 0.0);	// NaN출력 - 나눗셈 무한대로 나머지X
	}
}