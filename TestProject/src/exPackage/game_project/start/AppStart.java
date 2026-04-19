package exPackage.game_project.start;

import java.util.Scanner;

import exPackage.game_project.game.GaBaBo;
import exPackage.game_project.game.Guess;
import exPackage.game_project.info.AppInfo;

public class AppStart {

	public static void main(String[] args) {
		// 시작
		System.out.println("・𝜗𝜚・┈・┈・𝜗𝜚・┈・┈・𝜗𝜚・・𝜗𝜚・┈・┈・𝜗𝜚・┈・┈・𝜗𝜚・");
		System.out.println("  ★ꔫ 게임에 오신 것을 환영합니다 ꔫ★");
		System.out.println("・𝜗𝜚・┈・┈・・┈・┈・┈・┈・┈・┈・┈・┈・┈・・┈・┈・𝜗𝜚・");
		
		int num;
		
		//메뉴
		do {
			System.out.println("           ★ꔫ 메뉴 ꔫ★");
			System.out.println("・𝜗𝜚・┈・┈・・┈・┈・┈・┈・┈・┈・┈・┈・┈・・┈・┈・𝜗𝜚・");
			System.out.println("1. 애플리케이션 정보");
			System.out.println("2. 가위바위보 게임");
			System.out.println("3. 숫자 알아맞히기 게임");
			System.out.println("4. 종료");
			System.out.println("・𝜗𝜚・┈・┈・・┈・┈・┈・┈・┈・┈・┈・┈・┈・・┈・┈・𝜗𝜚・");

			Scanner sc = new Scanner(System.in);
			System.out.print("★ꔫ 메뉴 번호 입력 : ");
			num = sc.nextInt();
			
			// 정보 및 게임
			switch(num) {
			case 1:
				AppInfo.showInfo(); break;
			case 2:
				GaBaBo.play(sc); break;
			case 3: 
				Guess.play(sc); break;
			default:
				System.out.println("・𝜗𝜚・┈・┈・・┈・┈・┈・┈・┈・┈・┈・┈・┈・・┈・┈・𝜗𝜚・");
				System.out.println("            종료합니다! ");
				sc.close();
			}
		} while(num != 4);
		System.out.println("・𝜗𝜚・┈・┈・𝜗𝜚・┈・┈・𝜗𝜚・・𝜗𝜚・┈・┈・𝜗𝜚・┈・┈・𝜗𝜚・");
	}
}