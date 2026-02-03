package ch08.sec04;

public class Computer extends Calculator{
	// 메소드 재정의 - 정밀도 위해 Math.PI 사용
	@Override
	// 스프링은 어노테이션 안 붙으면 에러남
	double areaCircle(double r) {
		System.out.println("Computer 객체 areaCircle실행");
		return Math.PI*r*r;
	}
}