package ch12_collection.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		// LinkedList vs ArrayList
		// List = 인터페이스 중간역할을 하니까 보편적으로 많이 씀
		List<String> listArray = new ArrayList<>();
		List<String> listLinkedList = new LinkedList<>();
		
		ArrayList<String> ar = new ArrayList<>();
		LinkedList<String> lk = new LinkedList<>();
		
		long startTime, endTime;
		
		//////////////////// 인터페이스 참조객체 ////////////////////
		
		// List ArrayList
		startTime = System.nanoTime();//현재시간을 나노초로 변환하여 반환
		for(int i =0; i<1000;i++) {
			listArray.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("listArray 걸린시간: "+(endTime-startTime)+"ns");
		
		
		// List LinkedList
		startTime = System.nanoTime();//현재시간을 나노초로 변환하여 반환
		for(int i =0; i<1000;i++) {
			listLinkedList.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("listLinkedList 걸린시간: "+(endTime-startTime)+"ns");
		

		System.out.println("---------------------------------------");
		
		//////////////////// 자기 클래스의 참조변수 ////////////////////
		
		// ArrayList
		startTime = System.nanoTime();//현재시간을 나노초로 변환하여 반환
		for(int i =0; i<1000;i++) {
			ar.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ar 걸린시간: "+(endTime-startTime)+"ns");
		
		
		// LinkedList
		startTime = System.nanoTime();//현재시간을 나노초로 변환하여 반환
		for(int i =0; i<1000;i++) {
			lk.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("lk 걸린시간: "+(endTime-startTime)+"ns");
		
		
		
	}
}