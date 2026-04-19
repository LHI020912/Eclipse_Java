package ch06.sec07;

public class FinalMain {

	public static void main(String[] args) {
		// final 사용예제
		Final fi1 = new Final("양정원","1234");
		//fi1.ssn ="5678"; //ssn 상수이므로 대입연산 불가능
		
		System.out.print(fi1.nation);//접근해서 data 사용은 가능
	}

}
