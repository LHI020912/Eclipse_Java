package ch03.sec02;
import java.util.Scanner;

public class TimeCalculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, h, m, s;
		
		System.out.print("시간 입력 (초) : ");
		a = sc.nextInt();
		
		h = a/3600;
		m = (a%3600)/60;
		s = m%60;
		
		System.out.println(a +"초는 "+h+"시간, "+m+"분, "+s+"초입니다.");
		sc.close();
	}
}