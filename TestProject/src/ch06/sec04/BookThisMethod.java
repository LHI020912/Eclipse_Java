package ch06.sec04;

public class BookThisMethod {
	String title;
	String author;
	int price;
	
	//매개변수가 없는 기본 생성자
	BookThisMethod(){
		this("미정","미정");//현재 클래스 내의 다른생성자 호출
		//this("미정",10000);//this는 무조건 첫번째줄에만 = 에러(중복X)
		price =0;
	}
	BookThisMethod(String title, String author){
		this.title = title;
		this.author = author;
	}
	//매개변수가 2개인 생성자 위 생성자와는 매개변수 타입이 달라서 구별됨
	BookThisMethod(String title, int price){
		this.title = title;
		this.price = price;
	}// 매개변수 타입에 따라 동일한 메소드를 만들 수 있음 = 메소드 오버로딩
}