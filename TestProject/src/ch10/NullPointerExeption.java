package ch10;

public class NullPointerExeption {

	public static void main(String[] args) {
		// 참조하는 객체가 없는 참조변수에 . 연산자 사용한 경우 발생
		String data = null;
		System.out.println(data.toString());
		// java.lang.NullPointerException: 현재 예외 관리 클래스
	}

}
