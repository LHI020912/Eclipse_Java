package ch11.sec02;

public class GenMain {

	public static void main(String[] args) {
		// 제네릭 활용
		// 문자열 사용 객체 인스턴스
		Box<String> box = new Box<String>();
		box.set("양정원");
		String name = box.get();
		System.out.println(name);
		
		// Integer 사용하는 객체 인스턴스
		Box<Integer> box2 = new Box<Integer>();
		box2.set(7);
		int num = box2.get();
		System.out.println(num);
	}

}
