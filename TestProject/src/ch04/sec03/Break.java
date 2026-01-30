package ch04.sec03;

public class Break {

	public static void main(String[] args) {
		// break 예제
		// 특정 범위를 벗어나는 역할: 반복문과 같이 사용, switch~case
		// 반복취소 문장블록 종료
		int i =0;
		while(true) {
			//무한반복일 경우에 반복문 내부코드에서 종료에 해당하는 코드 구성
			System.out.println(i);
			i += 3;//3씩증가
			if(i>20)//20보다크면
				break;//break문이 포함된 가장 가까운 반복 블럭문 벗어남
		}
		System.out.print("break에 의해 반복 종료!");
	}
}