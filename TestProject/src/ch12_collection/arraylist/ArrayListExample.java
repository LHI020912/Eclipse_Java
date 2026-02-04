package ch12_collection.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		// 4개 단어를 입력받아 가장 긴 단어와 길이를 출력
		List<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<4;i++) {
			System.out.print("단어를 입력하세요 >> ");
			String w = sc.next();
			
			list.add(w);
		}
		System.out.println("--------------------------");
		
		for(String word:list) {
			System.out.print(word+" ");
		}
		
		String longer = "";
		for(String word:list) {
			if(word.length() > longer.length())
			longer = word;
		}
		
		System.out.println("\n가장 긴 단어는 : "+longer);
		System.out.println("가장 긴 단어의 길이는 : "+longer.length());
		
	}
}