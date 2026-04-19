package ch06.sec05;

public class ShareMain {

	public static void main(String[] args) {
		// static 활용 공유변수 사용
		Share s1, s2 ;
		s1 = new Share();//객체 인스턴스
		s1.set(5);//인스턴스 필드와 static 필드 전부 변경

		System.out.println("s1의 a: "+s1.showA());
		System.out.println("s1의 staticA: "+s1.showStaticA());

		s2 = new Share();
		s2.set(100);//인스턴스 필드와 static 필드 전부 변경

		System.out.println("s2의 a: "+s2.showA());
		System.out.println("s2의 staticA: "+s2.showStaticA());
		
		System.out.println("Share 클래스 staticA: "+Share.showStaticA());
	}
}