package ch05.sec02;
import java.util.Scanner;
public class ControlEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int choice;
		int m = 0; //입금받는
		int t = 0; //total
		
		do {
			System.out.println("\n--------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------");

			
			System.out.print("선택> ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: 
				System.out.print("예금액> ");
				m = sc.nextInt();
				t += m;
				break;
			case 2:
				System.out.print("출금액> ");
				m = sc.nextInt();
				t -= m;
				break;
			case 3: System.out.printf("잔고> %d",t); break;
			default: System.out.print("프로그램 종료");break;
			}
		}while(choice !=4);
	}
}