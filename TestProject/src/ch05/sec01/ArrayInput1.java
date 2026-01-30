package ch05.sec01;
import java.util.Scanner;

public class ArrayInput1 {

	public static void main(String[] args) {
		// 사용자로부터 입력받은 여러 데이터의 저장
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		
		System.out.println("숫자 입력: ");
		for(int i=0; i<nums.length;i++) {
			System.out.printf("nums[%d]: ", i);
			nums[i] = sc.nextInt();
		}
		
		System.out.print("\n입력된 값 출력 ");
		for(int i=0; i<nums.length;i++) {
			System.out.printf("nums[%d]= %d\n", i,nums[i]);
		}
		sc.close();
	}
}
