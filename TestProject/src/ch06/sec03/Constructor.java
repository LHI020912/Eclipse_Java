package ch06.sec03;

public class Constructor {
	int x; int y; //멤버필드
	//생성자 : 인스턴스 생성 시 한번 실행
	//매개변수 없는 생성자
	// ㄴ 개발자에 의해 객체 생성되면서 생성자에 정해진 값으로 필드 초기화
	//기능 구성할 수 있음
	public Constructor() {//기본 생성자
		x=100;
		System.out.println(x+"값으로 초기화된 인스턴스 생성!");
	}
}
