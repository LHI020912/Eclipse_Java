package ch04.sec01;
import java.util.Scanner;

public class ControlEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*******상품 정보*******");
		System.out.println("1 노트북: 1,200,000 원");
		System.out.println("2 디지털카메라: 400,000 원");
		System.out.println("*********************");
		
		int a = 1200000;
		int b = 400000;
		int choice=0;
		String name = "";

		System.out.print("상품번호 입력: ");
		int item = sc.nextInt();
		
		switch(item) {
		case 1: choice =a; name = "노트북"; break;
		case 2: choice = b; name = "디지털카메라"; break;
		default: System.out.println("잘 못입력하였습니다. 종료합니다."); return;
		}
		
		System.out.print("상품개수 입력: ");
		int count = sc.nextInt();
		int price = choice*count;
		
		double discount = 0;
		if(price >= 1000000)
			discount = 0.1;
		else if(price >= 500000)
			discount = 0.05;
		
		int discountP = (int)(price * discount);
		int total = price - discountP;
		
		
		System.out.println("*******주문 내용*******");
		System.out.println("상품명 : "+name);
		System.out.println("가격 : "+choice);
		System.out.println("주문 수량 : "+count);
		System.out.println("주문액 : "+price);
		System.out.println("할인액 : "+discountP);
		System.out.println("총지불액 : "+total);
		sc.close();
	}
}