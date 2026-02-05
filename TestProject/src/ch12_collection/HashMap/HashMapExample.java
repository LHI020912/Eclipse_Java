package ch12_collection.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		String eng, kor, input, result;

		System.out.println("단어장을 만들겁니다. (중단: exit)");
		while(true) {
			System.out.print("영단어를 적어주세요: ");
			eng = sc.next();
			
			if(eng.equals("exit")) break;
			
			System.out.print("뜻을 적어주세요: ");
			kor = sc.next();

			map.put(eng, kor);
		};
		
		System.out.println("단어 검색. (중단: exit)");
		
		while(true) {
			System.out.print("찾고 싶은 단어는? ");
			input = sc.next();
			
			if(input.equals("exit"))break;
			
			result = map.get(input);
			
			if(result != null)
				System.out.println(result);
			else
				System.out.println(input+"은 없는 단어입니다.");
		};
		System.out.println("종료합니다...");
	}
}