package ch04.sec02;

public class For {

	public static void main(String[] args) {
		// For문 예제
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}// for문 안에서만 지역변수 i

		// 누적연산
		int sum, i;
		sum = 0;
		for(i=1; i<=100;i++) {
		// 반복 종료되는 시점의 i값은 조건이 false여야 하므로 >100
			sum +=i; //1~100까지의 합
		}
		System.out.println("1~"+(i-1)+"합 : "+sum);
		
		// 증가감 표현 변경
		sum = 0;
		for(i=1; i<=100;i+=2) {//증가감연산 간격 조절가능
			sum +=i; //1~100까지의 홀수 합
		}
		System.out.println("1~"+(i-1)+"의 홀수합 : "+sum);
		
		////////////////// 중첩 for문 //////////////////
		// Ex) 구구단
		for (int m=2; m<=9; m++) {
			System.out.println("*** "+ m +"단 ***");
			for(int n=1;n<=9;n++) {
				System.out.println(m + " X " + n +" = "+(m*n));
			}
		}
		
	}
}
