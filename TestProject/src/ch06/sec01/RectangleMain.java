package ch06.sec01;

public class RectangleMain {

	public static void main(String[] args) {
		// Reactangle class 사용 예시
		Rectangle rec;
		rec = new Rectangle(); //성성자 함수
		//사각형 넓이 계산
		//객체 instance로 private 속성에는 접근 불가
		//main에서 클래스 객체 속성에 값 저장 (직접접근)
		//rec.height=20;
		//rec.width=10;
		rec.area();
		
		//클래스 객체 메소드를 통해 속성에 값 저장(간접접근)
		rec.input();
		rec.area();
		
		//System.out.println(rec.width);
		//객체 instance로 private 속성에는 접근 불가
	}

}
