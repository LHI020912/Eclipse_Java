package ch12_collection.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentKeyMatch {
	public static void main(String[] args) {
		Student key = new Student("3","박종성");
		// key를 참조타입으로 사용
		Map<Student, Integer> map = new HashMap<>();
		map.put(new Student("1","양정원"), 100);
		map.put(new Student("2","박성훈"), 96);
		map.put(new Student("3","박종성"), 96); // key: 독립적인 Student instance, 새로운 entry 추가
		map.put(new Student("3","박종성"), 95);
		
		Set<Student> key_set = map.keySet();
		for(Student stdKey : key_set) {
			System.out.println(stdKey.getStdNo() +" "+stdKey.getStdName()+" "+map.get(stdKey));
		}
		System.out.println("총 Entry 수 : "+ map.size());
		// 사용자 정의 클래스에서 객체를 HashMap의 키로 사용하려면
		// hashCode()와 equals()메소드를 재정의해서 동등객체가 될 조건을 정해야함
		// hashCode??? 언제 호출됨?? 재정의해서 아 찾음 Student 있었은
		// 이걸 부르는 곳은 map.put이래
	}
}