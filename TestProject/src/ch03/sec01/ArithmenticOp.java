package ch03.sec01;
import java.util.Scanner;
import java.text.DecimalFormat; //text출력 format설정(수치형)

public class ArithmenticOp {

	public static void main(String[] args) {
		// 산술연산자: 나머지 연산자(%)
		// %규칙 : 나눈 나머지 값은 0 ~ 나눈값 -1범위
		System.out.println("나머지 : "+(10%3));
		
		// 사용자 입력 (Scanner 사용)
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");//생성자 호출 시 초기값(인수)로 포맷문자 전달
		
		int kor, eng, math, total;
		float averge;
		

		System.out.print("국어점수 입력 : ");
		kor= sc.nextInt();//키보드를 통해 입력된 byte 데이터를 int형으로 변환 반환
		System.out.print("수학점수 입력 : ");
		math= sc.nextInt();
		System.out.print("영어점수 입력 : ");
		eng= sc.nextInt();
		
		total = kor + eng + math;
		averge = total / 3.0f ;//실수는 double기본 데이터 타입
		

		System.out.println("===============");
		System.out.print("총점 : "+total);
		System.out.print(", 평균 : "+ df.format(averge));
		// +연산: 문자와 다른 타입간의 연산이거나 문자+문자일 경우 결합
		
		sc.close();
	}

}
