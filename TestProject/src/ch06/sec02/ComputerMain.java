package ch06.sec02;

public class ComputerMain {

	public static void main(String[] args) {
		// 메오스 인수의 전달
		Computer myCom = new Computer();
		
		int[] values1 = {1,1,1};
		
		//인수로 배열 참조변수 전달
		System.out.println(myCom.sum1(values1)); 	//참조값 전달

		System.out.println(myCom.sum2(1,2,3));	 	//기본값 전달
		System.out.println(myCom.sum2(1,2));		//여러개의 인수를 전달하려면
		System.out.println(myCom.sum2(1,2,3,4,5));	//메소드에서 전달된 인수를 배열로 생성해서 사용
	}
}