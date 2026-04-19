package ch06.sec05;

public class StaticMember {
	//static: 클래스 고정되는 멤버, 전역변수/전역함수 구성시 활용
	//프로그램 실행 되자마자 생성됨. 종료시 삭제
	//객체 멤버와는 따로 컴파일러에 의해 관리됨
	
	//선언: 접근제한자 static 타입 변수명 ;
	public static int staticVal;	//static 필드(변수)
	public int num; 				//인스턴스 필드
	
	public void getNum(int x) {	//인스턴스 메소드
		num = x;				//인스턴스 필드 사용 가능
		staticVal = x;			//static 필드 사용 가능
		staticMethod(x);		//static 메소드 사용 가능
	}
	
	public static void f1() {	//static 메소드
		StaticMember test = new StaticMember();//직접 객체 생성
		test.getNum(0); 		//인스턴스 멤버 호출 가능
	}
	
	public static void staticMethod(int x) { //static 메소드
		staticVal = x;	//static 필드 사용 가능
		f1();			//static 메소드 호출 가능
		//num = x;		//인스턴스 필드 사용 불가능(객체 생성후 참조는 가능)
		//getNum(x);	//인스턴스 호출 불가능
	}
}