package ch12_collection.arraylist;
import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList listAr = new ArrayList();
		List list = new ArrayList();
		
		// 마지막에 추가
		list.add(100);
		list.add("양정원");
		list.add(5.77);
		list.add('a');
		
		// 컬렉션 내 객체의 개수 반환 size()
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i)); // Object 타입으로 진행되었음
		}

		System.out.println();
		// 특정 index에 추가
		list.add(0, "변경"); // 모든 요소들을 하나씩 뒤로 이동
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		// 특정 index에 요소삭제
		list.remove(1); // 삭제 인덱스 이후 모든 요소들을 하나씩 앞으로 이동
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}

		System.out.println();
		// 특정 요소가 list 항목 포함여부
		System.out.println(list.contains("양정원"));
		// 양정원 요소가 없으면 추가
		if(!(list.contains("양정원")))
			list.add("양정원");
		
	}
}