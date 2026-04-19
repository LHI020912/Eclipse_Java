package ch04.sec02;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// while문 정리 [밖에서 선언과 초기화 필요]
		
		int i = 0;
		int sum = 0;
		while(i<=100) {//짝수의 합 102가되면 false 반복 종료
			sum += i;
			i += 2; //2씩 증가
		}
		System.out.println("i값: "+i+", sum값: "+sum);
		//////////////////////////////////////////////
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("숫자입력: ");
		num = sc.nextInt();
		
		while(num !=7) { //입력값이 7이 아닌동안 반복
			System.out.print("다시 입력: ");
			num = sc.nextInt();
		}// 반복의 횟수가 정해져있지 않을 때 사용 권장
		System.out.println("7 입력. 종료.");
		sc.close();
	}
}
