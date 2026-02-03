package ch09.sec03;

public class Main {

	public static void main(String[] args) {
		// 구현 클래스 객체 생성
		ImplC c= new ImplC();
		
		// 인터페이스 참조변수에 c 변수 대입
		InterfaceA ia = c;
		InterfaceB ib = c;
		InterfaceC ic = c;
		
		ia.methodA(); // super 인터페이스 타입
		ib.methodB(); // 자신이 생성한 추상메소드만 접근
		
		// 서브 인터페이스에서는 상속 인터페이스의 추상메소드 접근O
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}