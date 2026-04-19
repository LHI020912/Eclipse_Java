package ch04.sec02;
import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		// do~while(조건검사를 뒤에서)
		// 조건이 처음부터 거짓이어도 무조건 한 번 실행을 진행
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("숫자입력: ");
		// num = sc.nextInt();
		// 입력값이 7이면 프로그램 종료.
		// 하지만 do~while을 사용해 처음부터 true여도 한 번 진행
		do {
			System.out.print("다시 입력: ");
			num = sc.nextInt();
		}while(num !=7);
		
		System.out.println("7 입력. 종료.");
		sc.close();
	}
}