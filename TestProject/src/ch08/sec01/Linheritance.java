package ch08.sec01;

public class Linheritance {

	public static void main(String[] args) {
		// 상속예제
		Child ob = new Child();//생성자 메소드 호출후 객체만듦
		//객체참조
		ob.setChild();	//sub 클래스 메소드 setChild()호출
		ob.setParent();	//super 클래스 메소드 호출
		ob.showChild();	//sub 클래스 메소드 호출
		
		Parent pb = new Parent();
		pb.setParent();
		pb.showParent();

	}

}
