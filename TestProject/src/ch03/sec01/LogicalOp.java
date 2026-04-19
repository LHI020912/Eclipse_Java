package ch03.sec01;

public class LogicalOp {

	public static void main(String[] args) {
		// 논리연산자는 비교연산자와 같이 사용되는 게 일반적
		int charCode = 'A';
		
		System.out.println((charCode>=65) & (charCode<=90));
		System.out.println((charCode>=65) && (charCode<=90));
		System.out.println(true & true);
		
		///if+else if문은 1번이 true이면 1에서 끝남.
		///
		///if((charCode >= 65) && (charCode<=90)) {
		///	// unicode 65~90 범위는 영문 대문자
		///	System.out.println("대문자입니다.");
		///} else if((charCode >= 97) && (charCode<=122)) {
		///	// unicode 65~90 범위는 영문 대문자
		///	System.out.println("소문자입니다.");
		///}
		///
		///아래 if만 사용한 경우는 전부 확인.
		
		if((charCode >= 65) && (charCode<=90)) {
			System.out.println("대문자입니다.");
		}
		if((charCode >= 97) && (charCode<=122)) {
			System.out.println("소문자입니다.");
		}
		// (charCode >= 97) && (charCode<=122)
		if(!(charCode <48) && !(charCode>57)) {
			// unicode 48~57 범위는 숫자
			System.out.println("0~9숫자 입니다.");
		}
		int value = 6;
		if((value % 2 == 0 ) | (value % 3 ==0)) {
			System.out.println("2 또는 3의 배수");
		}
		if((value % 2 == 0 ) || (value % 3 ==0)) {
			System.out.println("2 또는 3의 배수");
		}
	}
}
