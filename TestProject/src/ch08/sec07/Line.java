package ch08.sec07;

public class Line extends DrawingObject{
	public Line() {
		penColor = "red";
	}
	
	@Override
	public void draw() {
		// 재정의 필수
		System.out.println(penColor +"색상으로 선 그리기");
		
	}
}
