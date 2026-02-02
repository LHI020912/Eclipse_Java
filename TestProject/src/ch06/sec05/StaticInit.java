package ch06.sec05;

public class StaticInit {
	
	//인스턴스 필드와 메소드
	int a ;
	void method() {}
	
	//static 필드와 메소드
	static int staticA;
	static void staticMethod() {
		//static 메소드 내 this 사용불가
	}
	
	//static 블록(초기화)(복잡한)
	static {//가독성을 위해 static을 적어 넣는 경위
		//a=1;//인스턴스 변수 static블럭 사용불가
		//method();//인스턴스 메소드 static블럭 사용불가
		staticA = 10;
		staticMethod();
		
		// 객체 인스턴스 생성 후 사용하는 건 가능
		StaticInit st = new StaticInit();
		st.a=10;
		
	}
}
