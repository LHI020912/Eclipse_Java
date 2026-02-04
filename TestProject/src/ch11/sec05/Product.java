package ch11.sec05;

// 제네릭 타입 클래스
public class Product<T,M> {
	private T kind;
	private M model;
	
	public T getKind() {
		return this.kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
}
