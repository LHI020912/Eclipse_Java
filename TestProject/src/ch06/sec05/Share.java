package ch06.sec05;

public class Share {
	//공유목적
	int a; //0으로 초기화
	static int staticA;
	
	/////// 메소드 ///////
	//인스턴스 메소드
	public void set(int n) {
		a += n;
		staticA += n;
	}
	//인스턴스 메소드
	public int showA() {
		return a;
	}
	//static 메소드
	public static int showStaticA() {
		return staticA;
	}
}
