package ch06.sec03;

public class Reservation {
	//정의 : 예약 표현 클래스
	//저장을 위한 멤버변수 선언 필요(기본생성자 함수)
	String flight, name, departure, arrival, seatNo;
	int price;
	
	//1.생성자 함수 정의하기 (오버로딩가능)
	// : 인스턴스 생성 시 단 한번 호출, 객체 구성 용도, 개발자 입장 = 초기화목적
	//2.기본생성자 함수: 명시적 생성자 함수가 없으면 자동삽입, 명시적 생성자함수가 1개라도 있으면 자동x
	public Reservation() {// 빈 객체 생성 용도 - 기본 생성자 함수(자동)
		//인수 필요 X
	}
	// 위와는 다른 생성자 함수 = 명시적 생성자
	public Reservation(String fl, String na, String dpt, String arv, int p, String s) {
		// 미리 예약자를 주기 - 매개변수 선언 = 인수를 반드시 넘겨줘야함
		flight = flight; //대입연산의 효과가 없음 지역변수
		// 멤버변수 flight이 아닌 매개변수 flight으로 인식됨
		this.flight = flight; //이럴 때 (지역)매개변수 flight로 인식
		name = na;
		departure = dpt;
		arrival = arv;
		price = p;
		seatNo = s;
	}
	
	public void showRsvInfo() {//메소드 생성
		//웹에서는 return 연결되겠금(메인에서 연결법이 달라짐)
		System.out.println("**항공권 예약 정보**");
		System.out.println("항공기: "+flight);
		System.out.println("예약자: "+name);
		System.out.println("출발지: "+departure);
		System.out.println("도착지: "+arrival);
		System.out.println("금액: "+price);
		System.out.println("좌석번호: "+seatNo);
		
	}
}
