package ch11.sec02;

// 필드의 타입이 결정되지 않은 경우
// 미결정 타입을 T로 약속
// 객체 생성 시 T를 구체화 시켜야함.
public class Box <T> {
	private T object;

	public void set(T object) {
		this.object = object;
	}
	public T get() {
		return object;
	}
}
