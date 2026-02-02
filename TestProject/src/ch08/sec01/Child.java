package ch08.sec01;

//Parent 클래스 상속 받음
public class Child extends Parent {
	private int c;
	
	public void setChild() {
		c = 20;
	}
	
	public void showChild() {
		//protected 접근제한일 경우 동일패키지면 접근가능
		System.out.println("부모 클래스 p2 : "+ p2);
		showParent(); //Parent 클래스 메소드(상속받아 사용가능)
		System.out.println("자식 클래스 c : "+c);
	}

}
