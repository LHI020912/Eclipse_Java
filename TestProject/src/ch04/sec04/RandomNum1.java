package ch04.sec04;

public class RandomNum1 {

	public static void main(String[] args) {
		// 난수생성방법1: Math객체사용
		// static객체 Math.random() 값을 저장하거나 수정작업X
		// 0.0n~0.9n, 0 < 랜덤숫자 < 1 실수가 반환
		
		for(int i=1; i<=10;i++) {
			int num = (int)(Math.random()*10)+1;
			System.out.println(num);
		}

	}

}
