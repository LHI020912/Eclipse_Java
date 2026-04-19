package ch12_collection.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		// Map 컬렉션 생성
		// Map<key, Value>
		Map<String, Integer> map = new HashMap<>();
		
		// Map의 key는 중복 X : entry 구별하는 용도 key
		
		// Map collection 객체저장 : put(key,value)
		// key 값이 중복됨 => key 값이 콜렉션에 존재하는지 확인 후 발견시 value만 수정없으면 새로운 entry 추가
		map.put("양정원", 100);
		map.put("박성훈", 90);
		map.put("박종성", 92);
		map.put("양정원", 99); // key 중복되어 앞에서 put한 양정원:100 entry의 value가 수정됨
		// equals로 같은지 먼저 확인하고 기존 객체에 덮어쓰기(문자열이라 그럼)
		// String 클래스는 "큰따옴표"로 구성한 문자열 값이 같을 경우 동등객체가 될수 있도록
		// hashCode()와 equals()메소드가 재정의 되어있음
		
		// 전체 entry 수 : size()
		System.out.println("총 entry 수: "+map.size());
		
		// Map.get(key): 특정 키에대한 value 추출
		System.out.println("key 양정원에 대한 value : "+map.get("양정원"));
		System.out.println();
		
		// Map.setSet(): 모든 entry key 객체를 반환(Set type으로 반환)
		// Set: 순서가 없고 중복값이 없는 콜렉션
		Set<String> keySet = map.keySet();
		
		// 모든 collection 객체는 Iterator 인터페이스를 구현한다. 
		// for문은 가독성이 떨어진다!?
		// Iterator(): 콜렉션 순회를 가능하게 해주는 객체 Iterator 객체를 반환함
		Iterator<String> keyIterator = keySet.iterator();
		
		// map 전체 entry 출력
		// Iterator.hasNext(): 순회 중 참조할 항목이 있는지 여부 반환(true/false)
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();	// next() 참조한 항목의 값을 반환하고 포인터를 다음 참조로 이동
			Integer value = map.get(key);		// 해당 키의 짝인 값이 넘어와!
			System.out.println("\t"+key+" : "+value);
		} // key를 통한 구성
		System.out.println();
		
		// for문은 반복해서 검사하는 거라 가독성 다운인가봐...
		for(String k : keySet) {
			Integer value = map.get(k);
			System.out.println("\t"+k+" : "+value);
		}

		System.out.println();
		// map.entrySet(): 모든 entry 반환(Set type(중복X))
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			// 특정 entry key 추출: Entry.getKey();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+key+" : "+value);
		} // entry를 통한 구성
		System.out.println();
		
		// 모든 entry 삭제(1개:remove,다중:clear();)
		map.clear();
		System.out.println("총 entry 수: "+map.size());
	}
}