package ch12_collection.arraylist;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListEx {

	public static void main(String[] args) {
		// 고정된 객체들로 ArrayList 구성
		// 항목값 고정 = 추가,삭제 불가능
		// 상수와 비슷한 개념
		List<String> list1 = Arrays.asList("양정원","심재윤","박종성");
		for(String name:list1) {
			System.out.println(name);
		}
		// list1.add("박성훈");	// 오류발생 add는 제공X
		// list1.remove(0);		// 오류발생 remove제공X
		
		for(String name:list1) {
			System.out.println(name);
		}
		

		List<Integer> list2 = Arrays.asList(1,2,3);
		for(int num:list2) {
			System.out.println(num);
		}
	}
}