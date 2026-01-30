package ch04.sec04;
import java.util.Random;
public class RandomNum2 {

	public static void main(String[] args) {
		// 난수생성방법2
		// Random 클래스 : 기본객체가 아니므로 import
		// import java.util.Random : static이 아니므로 참조변수(인스턴스)생성 사용
		Random r = new Random();
		for(int i=1; i<=10; i++) {
			int num = r.nextInt(10);
			//10이라는 바운드 주기, 0~9범위 10개중에서 생성
			System.out.println(num);
		}
	}
}
