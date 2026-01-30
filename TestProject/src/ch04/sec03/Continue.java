package ch04.sec03;

public class Continue {

	public static void main(String[] args) {
		// continue문 : 특정조건에 닿으면 해당 실행블럭의 남은 코드를 실행하지 않고 다음 반복 진행
		for(int i=1;i<=10;i++) {
			if(i%2 !=0)
				continue; //이후 문장 수행을 중단하고 다음 반복 진행
			System.out.println(i);
			// 조건없이 continue 사용하면 오류남;
		}
	}
}