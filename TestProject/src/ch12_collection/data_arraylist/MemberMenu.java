package ch12_collection.data_arraylist;

import java.util.Scanner;

public class MemberMenu {

	public static void main(String[] args) {
		MemberControllerMain main = new MemberControllerMain();
		Scanner sc = new Scanner(System.in);
		int m = 0; // 메뉴선택
		
		do {
			System.out.println("1. 회원가입");
			System.out.println("2. 회원탈퇴");
			System.out.println("3. 전체회원조회");
			System.out.println("4. 개인회원조회");
			System.out.println("5. 회원정보수정");
			System.out.println("6. 종료");
			System.out.print("번호를 입력하세요: ");
			m = sc.nextInt();
			
			switch(m){
			case 1: main.join(); break;
			case 2: main.del(); break;
			case 3: main.allView(); break;
			case 4: main.view(); break;
			case 5: main.re(); break;
			case 6: System.out.println("시스템을 종료합니다."); break;
			default: System.out.println("잘 못 입력하셨습니다!"); break;
			}
		}while(m != 6);
		
		
		sc.close();
	}
}