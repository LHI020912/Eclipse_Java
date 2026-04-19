package ch05.sec01;
import java.util.Scanner;

public class ArrayInputEx1 {

	public static void main(String[] args) {
		//숫자 5개받아 최대값 구하기
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		
		System.out.println("숫자입력");
		for(int i=0; i<num.length;i++) {
			System.out.printf("num[%d] : ",i);
			num[i] = sc.nextInt();
		}
		System.out.printf("\n입력된 값 : %d\n", num[0]);
		
		int max = num[0];
		for(int i=0; i<num.length; i++) {
			if(num[i]>max)
				max=num[i];
		}
		System.out.printf("최대값 : %d", max);
		
	}

}
