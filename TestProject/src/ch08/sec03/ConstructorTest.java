package ch08.sec03;

class A{
	public A(int x) {
		System.out.println("명시적 기본생성자 A");
	}
}

class B extends A{
	public B(int x) {
		// super 클래스에 기본 생성자 없으면 
		// B클래스의 생성자에서 A클래스 생성요청 불가 =명시적 생성자 호출
		super(x);
		System.out.println("명시적 기본생성자 B "+x);
	}
}


public class ConstructorTest {

	public static void main(String[] args) {
		// 생성자 호출 순서 연습
		B b = new B(5);
		
		// toString 연습
		Employee emp1 = new Employee("2429","양정원","엔하이픈");
		Employee emp2 = new Employee("2420","박종성","엔하이픈");
		System.out.println(emp2); // 객체인스턴스의 출력
		// Employee 클래스에 toString() 재정의 되어 있으므로 toString자동 호출
		
		// 생성자의 매개변수 전달
		Manager mg = new Manager("2429","양정원","엔하이픈","리더");
		System.out.println(mg);
	}

}
