package ch12_collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGenEx {

	public static void main(String[] args) {
		// ArrayList를 Generic type
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"DataBase");
		list.add("MyBATIS");
		// list.add(30); // generic type ues. int not able
		
		// 항목수 반환
		int size = list.size();
		System.out.println("총 항목 수 : "+size);
		System.out.println();
		
		for(int i = 0; i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i+":"+str); // String타입으로 구체화
		}
		
		System.out.println();
		String skill = list.get(2);
		System.out.println(2+":"+skill);
		
		// 중간 공간을 비우지 않음 : 이동발생
		list.remove(2); // 특정 idx 값을 삭제하면 2번idx공간은 이후 항목들이 하나씩 이동하며 채움
		list.remove(2);
		list.remove("MyBATIS"); // 특정 항목 삭제

		System.out.println();
		for(int i = 0; i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}

		System.out.println();
		for(String value : list) {
			System.out.println(value);
		}
		
		// 문자열 : 문자열 개수 반환(length())
		System.out.println();
		System.out.println("각 항목의 문자 수");
		for(String value : list) {
			System.out.println(value+":"+value.length());
		}
		
	}
}
