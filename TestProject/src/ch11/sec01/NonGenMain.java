package ch11.sec01;

public class NonGenMain {

	public static void main(String[] args) {
		Box box = new Box();
		Box box2 = new Box();
		
		// 문자열, 정수, 실수, 문자등이 자동형변환
		box.set("양정원");
		box2.set(7);
		box.set(10.0);
		box.set('a');
		
		box.set("심재윤");		// 문자열 data저장
		// 타입 불일치 에러 발생
		// String name = box.get();// Object 타입의 data 반환
		
		// 강제 타입 변환
		String name = (String)box.get();
		System.out.println(name);
		
		box2.set(100);				// int ->Object 타입으로 자동타입변환
		int num = (int)box2.get();	// Object -> int 자동타입변환 불가능
		System.out.println(num);
	}
}