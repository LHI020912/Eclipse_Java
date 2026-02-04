package ch11.sec05;

// subclass 에서 superclass 타입파라미터를 표기
// subclass 에서 결정되지 않은 타입이 있다면 타입파라미터 추가O
public class ChildProduct<T,M,C> extends Product<T,M>{
	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
	
	
}
