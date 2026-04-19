package ch06.sec05;

public class Calculator {
	// static 필드는 생성자 사용하지 않으므로 명시적 초기화 권장
	static double pi = 3.14159;
	
	static int plus(int x,int y) {
		return x+y;
	}
	
	static int minus(int x,int y) {
		return x-y;
	}
}
