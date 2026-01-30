package ch06.sec02;

public class Computer {
	//매개변수로 배열 전달 받아 배열의 요소값을 모두 더한 결과를 반환
	//배열은 참조객체이므로 참조값 전달됨 (주소)
	public int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	//매개변수의 값의 리스트 전달(동적배열) (일반값)
	//... : 전달된 값의 수에 따라 자동으로 배열 생성, 인수로 값의 리스트가 전달
	int sum2(int ... values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];//배열을 순회하며 더하는
		}
		return sum;
	}
}