package exPackage.game_project.game;

import java.util.Scanner;

public class GaBaBo {
	static String[] g = {"가위","바위","보"};
	static int cNum, uNum;
	
	// 1. 컴퓨터 숫자정하기
	static public void setRandom() {
		cNum = (int)(Math.random()*3+1);
	}
	
	// 2. 유저 숫자 받고 비교
	static public void getUser(Scanner sc) {
		System.out.print("번호 입력 : ");
		uNum = sc.nextInt();
		
		if(uNum == cNum)
			System.out.printf("\n비겼습니다! \n컴퓨터는 %s입니다.",g[cNum-1]);
		else if((uNum==1 && cNum==3) ||(uNum==2 && cNum==1) || (uNum==3 && cNum==2))
			System.out.printf("\n당신이 이겼습니다! \n컴퓨터는 %s입니다.",g[cNum-1]);
		else
			System.out.printf("\n아쉽게 졌습니다! \n컴퓨터는 %s입니다.",g[cNum-1]);
		
	}
	
	// 3. 게임 메인
	public static void play(Scanner sc) {
		char c;
		
		System.out.println("・𝜗𝜚・┈・┈・・┈・┈・┈・┈・┈・┈・┈・┈・┈・・┈・┈・𝜗𝜚・");
		System.out.println("       ★ꔫ 가위바위보 게임 ꔫ★");
		
		do {
			System.out.println("・𝜗𝜚┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈𝜗𝜚・");
			System.out.println("가위 바위 보 게임 :1.가위, 2.바위, 3.보");
			
			setRandom();
			getUser(sc);
			
			System.out.print("계속하시겠습니까? (y/n) : ");
			c = sc.next().charAt(0);
			
		}while(c == 'y');
		
		
		System.out.println("게임을 종료합니다.");
		System.out.println("・𝜗𝜚・┈・┈・・┈・┈・┈・┈・┈・┈・┈・┈・┈・・┈・┈・𝜗𝜚・");
		
	}
}
