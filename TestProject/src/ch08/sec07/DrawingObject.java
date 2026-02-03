package ch08.sec07;

public abstract class DrawingObject {
	public String penColor;
	
	// draw() 메소드는 반드시 필요하지만 기능이 결정되지 않은 상태
	// 추상메소드로 구성 - 상속받은 클래스가 draw()메소드 구체화
	public abstract void draw();

}
