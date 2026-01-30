package ch05.sec01;

import java.util.Scanner;

public class ArrayInput2 {

	public static void main(String[] args) {
		// 사용자로부터 입력받은 여러 데이터의 저장
		Scanner sc = new Scanner(System.in);
		String[] nums = new String[5];
		
		System.out.println("이름 입력: ");
		for(int i=0; i<nums.length;i++) {
			System.out.printf("nums[%s]: ", i);
			nums[i] = sc.next();
		}
		
		System.out.print("\n입력된 값 출력\n");
		for(int i=0; i<nums.length;i++) {
			System.out.printf("nums[%s]= %s%n", i,nums[i]);
		}	// %n ===\n과 같은 의미
		sc.close();
	}
}
