package ch06.sec03;

public class ReservationMain {

	public static void main(String[] args) {
		// 예약 진행
		// 참조변수 선언
		Reservation rsv = new Reservation("Ke1001","양정원","인천","뉴욕",1600000,"A38");
		rsv.showRsvInfo();
		rsv = null; // = 정보를 가지고있는 인스턴스 삭제 개념"예약취소같은거"
		rsv = new Reservation();//새로 기본생성자함수 불러오기
		rsv.showRsvInfo(); // 이러면 기본값 들어옴
	}
}